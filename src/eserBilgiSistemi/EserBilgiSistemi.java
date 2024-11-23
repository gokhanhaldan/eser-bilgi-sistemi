package eserBilgiSistemi; 
import java.util.Scanner;

class ReadingMaterial {
    protected String title;
    protected int numberOfPages;
    protected String publisher;
    protected int year;
    protected int edition;

    public ReadingMaterial(String title, int numberOfPages, String publisher, int year, int edition) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.year = year;
        this.edition = edition;
    }

    public String formattedInfo() {
    	
    	
        int maxTitleLength = 40; 
        int maxPublisherLength = 20; 

        String shortTitle = title.length() > maxTitleLength
                            ? title.substring(0, maxTitleLength - 3) + "..."
                            : title;

        String shortPublisher = publisher.length() > maxPublisherLength
                                ? publisher.substring(0, maxPublisherLength - 3) + "..."
                                : publisher;

        return String.format("Title: %-40s | Pages: %-4d | Publisher: %-20s | Year: %-5d | Edition: %-2d", 
                             shortTitle, numberOfPages, shortPublisher, year, edition);
    }
}
class Book extends ReadingMaterial {
    protected String author;

    public Book(String title, int numberOfPages, String publisher, int year, int edition, String author) {
        super(title, numberOfPages, publisher, year, edition);
        this.author = author;
    }
    public String formattedInfo() {
        return String.format("%s | Author: %-20s", super.formattedInfo(), author);
    }
}
public class EserBilgiSistemi {
    private static Book[][] bookLibrary = new Book[20][20];

    public static void initializeLibrary() {

    	bookLibrary[0][0] = new Book("Artificial Intelligence", 500, "Tech Press", 2021, 2, "Stuart Russell");
        bookLibrary[0][1] = new Book("Introduction to Algorithms", 1000, "MIT Press", 2009, 3, "Thomas Cormen");
        bookLibrary[0][2] = new Book("Clean Code", 450, "Prentice Hall", 2008, 1, "Robert C. Martin");
        bookLibrary[0][3] = new Book("Design Patterns", 395, "Addison-Wesley", 1994, 1, "Erich Gamma");
        bookLibrary[0][4] = new Book("The Pragmatic Programmer", 352, "Addison-Wesley", 1999, 2, "Andrew Hunt");
        bookLibrary[0][5] = new Book("Structure and Interpretation of Computer Programs", 657, "MIT Press", 1996, 2, "Harold Abelson");
        bookLibrary[0][6] = new Book("Operating System Concepts", 976, "Wiley", 2018, 10, "Abraham Silberschatz");
        bookLibrary[0][7] = new Book("Computer Networks", 960, "Prentice Hall", 2010, 5, "Andrew S. Tanenbaum");
        bookLibrary[0][8] = new Book("Code: The Hidden Language of Computer Hardware and Software", 393, "Microsoft Press", 2000, 1, "Charles Petzold");
        bookLibrary[0][9] = new Book("Algorithms", 992, "Addison-Wesley", 2011, 4, "Robert Sedgewick");
        bookLibrary[0][10] = new Book("Compilers: Principles, Techniques, and Tools", 1000, "Pearson", 2006, 2, "Alfred V. Aho");
        bookLibrary[0][11] = new Book("Deep Learning", 800, "MIT Press", 2016, 1, "Ian Goodfellow");
        bookLibrary[0][12] = new Book("Computer Architecture: A Quantitative Approach", 856, "Morgan Kaufmann", 2011, 5, "John L. Hennessy");
        bookLibrary[0][13] = new Book("The Mythical Man-Month", 322, "Addison-Wesley", 1995, 2, "Frederick P. Brooks Jr.");
        bookLibrary[0][14] = new Book("Refactoring", 448, "Addison-Wesley", 2018, 2, "Martin Fowler");
        bookLibrary[0][15] = new Book("The Art of Computer Programming", 672, "Addison-Wesley", 2011, 4, "Donald E. Knuth");
        bookLibrary[0][16] = new Book("You Don't Know JS", 278, "O'Reilly Media", 2015, 1, "Kyle Simpson");
        bookLibrary[0][17] = new Book("Head First Design Patterns", 694, "O'Reilly Media", 2004, 1, "Eric Freeman");
        bookLibrary[0][18] = new Book("Computer Science Distilled", 221, "Code Energy", 2017, 1, "Wladston Ferreira Filho");
        bookLibrary[0][19] = new Book("Programming Pearls", 256, "Addison-Wesley", 1999, 2, "Jon Bentley");


        bookLibrary[1][0] = new Book("Sapiens: A Brief History of Humankind", 512, "Harper", 2015, 1, "Yuval Noah Harari");
        bookLibrary[1][1] = new Book("Guns, Germs, and Steel", 480, "W.W. Norton & Company", 1997, 2, "Jared Diamond");
        bookLibrary[1][2] = new Book("The Silk Roads", 600, "Vintage", 2016, 1, "Peter Frankopan");
        bookLibrary[1][3] = new Book("A People's History of the United States", 729, "Harper Perennial", 2003, 1, "Howard Zinn");
        bookLibrary[1][4] = new Book("The History of the Ancient World", 896, "W.W. Norton & Company", 2007, 1, "Susan Wise Bauer");
        bookLibrary[1][5] = new Book("The History of the Medieval World", 768, "W.W. Norton & Company", 2010, 1, "Susan Wise Bauer");
        bookLibrary[1][6] = new Book("The History of the Renaissance World", 816, "W.W. Norton & Company", 2013, 1, "Susan Wise Bauer");
        bookLibrary[1][7] = new Book("The Wright Brothers", 336, "Simon & Schuster", 2015, 1, "David McCullough");
        bookLibrary[1][8] = new Book("Team of Rivals: The Political Genius of Abraham Lincoln", 916, "Simon & Schuster", 2005, 1, "Doris Kearns Goodwin");
        bookLibrary[1][9] = new Book("The Rise and Fall of the Third Reich", 1249, "Simon & Schuster", 1960, 1, "William L. Shirer");
        bookLibrary[1][10] = new Book("The War That Ended Peace", 784, "Penguin Books", 2013, 1, "Margaret MacMillan");
        bookLibrary[1][11] = new Book("The Origins of the Second World War", 352, "Penguin Books", 1961, 1, "A.J.P. Taylor");
        bookLibrary[1][12] = new Book("The Thirty Years War", 1024, "Routledge", 1997, 2, "Geoffrey Parker");
        bookLibrary[1][13] = new Book("The Crusades", 432, "Viking", 2012, 1, "Thomas Asbridge");
        bookLibrary[1][14] = new Book("The Great War for Civilisation", 1107, "Vintage", 2006, 1, "Robert Fisk");
        bookLibrary[1][15] = new Book("The Cold War", 736, "Doubleday", 2005, 1, "John Lewis Gaddis");
        bookLibrary[1][16] = new Book("The Fall of the Roman Empire", 592, "Oxford University Press", 2005, 1, "Peter Heather");
        bookLibrary[1][17] = new Book("The First World War", 368, "Penguin Books", 2004, 1, "Hew Strachan");
        bookLibrary[1][18] = new Book("A Short History of Nearly Everything", 544, "Broadway Books", 2003, 1, "Bill Bryson");
        bookLibrary[1][19] = new Book("The History of Western Philosophy", 842, "Routledge", 1945, 1, "Bertrand Russell");


        bookLibrary[2][0] = new Book("Prisoners of Geography", 320, "Elliot & Thompson", 2016, 1, "Tim Marshall");
        bookLibrary[2][1] = new Book("The Power of Geography", 400, "Scribner", 2021, 1, "Tim Marshall");
        bookLibrary[2][2] = new Book("Geographica", 400, "Penguin", 2003, 1, "Various Authors");
        bookLibrary[2][3] = new Book("Why Geography Matters", 352, "Oxford University Press", 2005, 1, "Harm de Blij");
        bookLibrary[2][4] = new Book("How to Lie with Maps", 256, "University of Chicago Press", 1996, 2, "Mark Monmonier");
        bookLibrary[2][5] = new Book("Guns, Germs, and Steel", 480, "W.W. Norton & Company", 1997, 2, "Jared Diamond");
        bookLibrary[2][6] = new Book("1491: New Revelations of the Americas", 576, "Vintage", 2005, 1, "Charles C. Mann");
        bookLibrary[2][7] = new Book("Topophilia: A Study of Environmental Perception", 260, "Columbia University Press", 1990, 1, "Yi-Fu Tuan");
        bookLibrary[2][8] = new Book("The Geography of Bliss", 345, "Twelve", 2008, 1, "Eric Weiner");
        bookLibrary[2][9] = new Book("The Revenge of Geography", 432, "Random House", 2012, 1, "Robert D. Kaplan");
        bookLibrary[2][10] = new Book("Atlas Obscura", 480, "Workman Publishing", 2016, 1, "Joshua Foer");
        bookLibrary[2][11] = new Book("Factfulness: Ten Reasons We're Wrong About the World", 352, "Flatiron Books", 2018, 1, "Hans Rosling");
        bookLibrary[2][12] = new Book("The Great Arc", 240, "Harper Perennial", 2000, 1, "John Keay");
        bookLibrary[2][13] = new Book("A History of the World in 12 Maps", 544, "Allen Lane", 2012, 1, "Jerry Brotton");
        bookLibrary[2][14] = new Book("Cosmos", 384, "Random House", 1980, 1, "Carl Sagan");
        bookLibrary[2][15] = new Book("The Map That Changed the World", 352, "Harper Perennial", 2001, 1, "Simon Winchester");
        bookLibrary[2][16] = new Book("Longitude", 208, "Walker Books", 1995, 1, "Dava Sobel");
        bookLibrary[2][17] = new Book("Collapse: How Societies Choose to Fail or Succeed", 592, "Penguin Books", 2005, 1, "Jared Diamond");
        bookLibrary[2][18] = new Book("The Future of Geography", 368, "Atlantic Monthly Press", 2023, 1, "Tim Marshall");
        bookLibrary[2][19] = new Book("Geopolitics: A Very Short Introduction", 192, "Oxford University Press", 2013, 1, "Klaus Dodds");


        bookLibrary[3][0] = new Book("A Brief History of Mathematics", 275, "Oxford Press", 2015, 1, "Roger Penrose");
        bookLibrary[3][1] = new Book("Introduction to Mathematical Thinking", 350, "Princeton", 2016, 2, "Keith Devlin");
        bookLibrary[3][2] = new Book("Mathematics for the Nonmathematician", 370, "Dover", 1982, 1, "Morris Kline");
        bookLibrary[3][3] = new Book("The Joy of x", 336, "Mariner Books", 2013, 1, "Steven Strogatz");
        bookLibrary[3][4] = new Book("Fermat's Enigma", 350, "Anchor", 1998, 1, "Simon Singh");
        bookLibrary[3][5] = new Book("The Code Book", 416, "Anchor", 2000, 1, "Simon Singh");
        bookLibrary[3][6] = new Book("Flatland: A Romance of Many Dimensions", 96, "Princeton", 2008, 2, "Edwin A. Abbott");
        bookLibrary[3][7] = new Book("Gödel, Escher, Bach", 777, "Basic Books", 1999, 1, "Douglas R. Hofstadter");
        bookLibrary[3][8] = new Book("In Pursuit of the Unknown", 272, "Oxford University Press", 2013, 1, "Ian Stewart");
        bookLibrary[3][9] = new Book("The Mathematical Universe", 448, "Penguin Books", 1994, 1, "William Dunham");
        bookLibrary[3][10] = new Book("How Not to Be Wrong", 400, "Penguin Books", 2014, 1, "Jordan Ellenberg");
        bookLibrary[3][11] = new Book("The Music of the Primes", 386, "Harper Perennial", 2003, 1, "Marcus du Sautoy");
        bookLibrary[3][12] = new Book("Journey Through Genius", 304, "Penguin Books", 1990, 1, "William Dunham");
        bookLibrary[3][13] = new Book("Calculus Made Easy", 336, "St. Martin's Press", 1998, 1, "Silvanus P. Thompson");
        bookLibrary[3][14] = new Book("Prime Obsession", 352, "Joseph Henry Press", 2003, 1, "John Derbyshire");
        bookLibrary[3][15] = new Book("What is Mathematics?", 592, "Oxford University Press", 1996, 2, "Richard Courant");
        bookLibrary[3][16] = new Book("A Mathematician's Apology", 153, "Cambridge University Press", 1992, 2, "G.H. Hardy");
        bookLibrary[3][17] = new Book("Proofs and Refutations", 300, "Cambridge University Press", 1976, 1, "Imre Lakatos");
        bookLibrary[3][18] = new Book("Mathematics: Its Content, Methods, and Meaning", 1136, "Dover", 1999, 1, "A.D. Aleksandrov");
        bookLibrary[3][19] = new Book("The Princeton Companion to Mathematics", 1056, "Princeton", 2008, 1, "Timothy Gowers");


        bookLibrary[4][0] = new Book("The Feynman Lectures on Physics", 1552, "Addison-Wesley", 1964, 1, "Richard Feynman");
        bookLibrary[4][1] = new Book("The Elegant Universe", 450, "W.W. Norton", 1999, 1, "Brian Greene");
        bookLibrary[4][2] = new Book("A Brief History of Time", 256, "Bantam", 1988, 2, "Stephen Hawking");
        bookLibrary[4][3] = new Book("Black Holes and Time Warps", 619, "W.W. Norton", 1994, 1, "Kip S. Thorne");
        bookLibrary[4][4] = new Book("Astrophysics for People in a Hurry", 224, "W.W. Norton", 2017, 1, "Neil deGrasse Tyson");
        bookLibrary[4][5] = new Book("Six Easy Pieces", 176, "Addison-Wesley", 1995, 1, "Richard Feynman");
        bookLibrary[4][6] = new Book("Cosmos", 384, "Random House", 1980, 1, "Carl Sagan");
        bookLibrary[4][7] = new Book("Physics of the Impossible", 352, "Doubleday", 2008, 1, "Michio Kaku");
        bookLibrary[4][8] = new Book("The Quantum Universe", 272, "Penguin Books", 2011, 1, "Brian Cox");
        bookLibrary[4][9] = new Book("The Grand Design", 208, "Bantam", 2010, 1, "Stephen Hawking");
        bookLibrary[4][10] = new Book("In Search of Schrödinger's Cat", 368, "Bantam", 1984, 1, "John Gribbin");
        bookLibrary[4][11] = new Book("QED: The Strange Theory of Light and Matter", 158, "Princeton University Press", 1985, 1, "Richard Feynman");
        bookLibrary[4][12] = new Book("The Fabric of the Cosmos", 592, "Penguin Books", 2004, 1, "Brian Greene");
        bookLibrary[4][13] = new Book("Why Does E=mc²?", 264, "Da Capo Press", 2009, 1, "Brian Cox");
        bookLibrary[4][14] = new Book("Relativity: The Special and General Theory", 168, "Crown", 1920, 1, "Albert Einstein");
        bookLibrary[4][15] = new Book("The First Three Minutes", 224, "Basic Books", 1977, 1, "Steven Weinberg");
        bookLibrary[4][16] = new Book("The Particle at the End of the Universe", 368, "Dutton", 2012, 1, "Sean Carroll");
        bookLibrary[4][17] = new Book("From Eternity to Here", 448, "Dutton", 2010, 1, "Sean Carroll");
        bookLibrary[4][18] = new Book("Quantum Mechanics and Path Integrals", 384, "Dover", 1965, 1, "Richard Feynman");
        bookLibrary[4][19] = new Book("Thermodynamics: An Engineering Approach", 1056, "McGraw-Hill", 2014, 8, "Yunus Çengel");


        bookLibrary[5][0] = new Book("The Disappearing Spoon", 400, "Little, Brown", 2010, 1, "Sam Kean");
        bookLibrary[5][1] = new Book("Napoleon's Buttons", 384, "Jeremy P. Tarcher", 2004, 1, "Penny Le Couteur");
        bookLibrary[5][2] = new Book("Chemistry: The Central Science", 1232, "Pearson", 2013, 13, "Theodore E. Brown");
        bookLibrary[5][3] = new Book("Molecules: The Elements and the Architecture of Everything", 320, "Black Dog & Leventhal", 2014, 1, "Theodore Gray");
        bookLibrary[5][4] = new Book("Periodic Tales", 448, "Ecco", 2011, 1, "Hugh Aldersey-Williams");
        bookLibrary[5][5] = new Book("Stuff Matters", 272, "Mariner Books", 2014, 1, "Mark Miodownik");
        bookLibrary[5][6] = new Book("The Elements: A Visual Exploration of Every Known Atom in the Universe", 240, "Black Dog & Leventhal", 2009, 1, "Theodore Gray");
        bookLibrary[5][7] = new Book("The Joy of Chemistry", 288, "Prometheus Books", 2009, 1, "Cathy Cobb");
        bookLibrary[5][8] = new Book("Uncle Tungsten: Memories of a Chemical Boyhood", 337, "Vintage", 2001, 1, "Oliver Sacks");
        bookLibrary[5][9] = new Book("The Poisoner's Handbook", 336, "Penguin Books", 2010, 1, "Deborah Blum");
        bookLibrary[5][10] = new Book("The Alchemy of Air", 320, "Broadway Books", 2009, 1, "Thomas Hager");
        bookLibrary[5][11] = new Book("What is Chemistry?", 152, "Oxford University Press", 2013, 1, "Peter Atkins");
        bookLibrary[5][12] = new Book("Crucibles: The Story of Chemistry", 368, "Dover", 1991, 1, "Bernard Jaffe");
        bookLibrary[5][13] = new Book("Superheavy: Making and Breaking the Periodic Table", 336, "Bloomsbury", 2019, 1, "Kit Chapman");
        bookLibrary[5][14] = new Book("The Story of Chemistry", 192, "Arcturus Publishing", 2017, 1, "Anne Rooney");
        bookLibrary[5][15] = new Book("Chemical Principles", 1200, "Cengage Learning", 2017, 8, "Steven S. Zumdahl");
        bookLibrary[5][16] = new Book("Organic Chemistry", 1360, "Wiley", 2017, 11, "T.W. Graham Solomons");
        bookLibrary[5][17] = new Book("Inorganic Chemistry", 1100, "Pearson", 2018, 6, "Gary L. Miessler");
        bookLibrary[5][18] = new Book("Physical Chemistry", 1200, "Oxford University Press", 2014, 10, "Peter Atkins");
        bookLibrary[5][19] = new Book("Principles of Modern Chemistry", 1300, "Cengage Learning", 2017, 8, "David Oxtoby");


        bookLibrary[6][0] = new Book("The Selfish Gene", 360, "Oxford Press", 1976, 1, "Richard Dawkins");
        bookLibrary[6][1] = new Book("The Gene: An Intimate History", 592, "Scribner", 2016, 1, "Siddhartha Mukherjee");
        bookLibrary[6][2] = new Book("Biology", 1264, "Pearson", 2013, 9, "Campbell and Reece");
        bookLibrary[6][3] = new Book("The Origin of Species", 502, "John Murray", 1859, 1, "Charles Darwin");
        bookLibrary[6][4] = new Book("Your Inner Fish", 256, "Vintage", 2008, 1, "Neil Shubin");
        bookLibrary[6][5] = new Book("Life Ascending", 336, "Norton", 2009, 1, "Nick Lane");
        bookLibrary[6][6] = new Book("The Vital Question", 368, "Profile Books", 2015, 1, "Nick Lane");
        bookLibrary[6][7] = new Book("Why We Sleep", 368, "Scribner", 2017, 1, "Matthew Walker");
        bookLibrary[6][8] = new Book("The Immortal Life of Henrietta Lacks", 381, "Crown", 2010, 1, "Rebecca Skloot");
        bookLibrary[6][9] = new Book("The Human Brain", 448, "Penguin Books", 2003, 1, "Rita Carter");
        bookLibrary[6][10] = new Book("DNA: The Secret of Life", 446, "Knopf", 2003, 1, "James D. Watson");
        bookLibrary[6][11] = new Book("I Contain Multitudes", 368, "Ecco", 2016, 1, "Ed Yong");
        bookLibrary[6][12] = new Book("The Epigenetics Revolution", 368, "Icon Books", 2011, 1, "Nessa Carey");
        bookLibrary[6][13] = new Book("Behave: The Biology of Humans at Our Best and Worst", 768, "Penguin", 2017, 1, "Robert M. Sapolsky");
        bookLibrary[6][14] = new Book("Human Evolution", 384, "Oxford University Press", 2016, 1, "Robin Dunbar");
        bookLibrary[6][15] = new Book("The Sixth Extinction", 336, "Henry Holt", 2014, 1, "Elizabeth Kolbert");
        bookLibrary[6][16] = new Book("The Man Who Knew Infinity", 464, "Simon & Schuster", 1991, 1, "Robert Kanigel");
        bookLibrary[6][17] = new Book("She Has Her Mother's Laugh", 608, "Simon & Schuster", 2018, 1, "Carl Zimmer");
        bookLibrary[6][18] = new Book("On the Origin of Life", 256, "Harvard University Press", 2016, 1, "Paul Davies");
        bookLibrary[6][19] = new Book("Genome", 352, "Harper Perennial", 1999, 1, "Matt Ridley");


        bookLibrary[7][0] = new Book("To Kill a Mockingbird", 336, "J.B. Lippincott & Co.", 1960, 1, "Harper Lee");
        bookLibrary[7][1] = new Book("Pride and Prejudice", 279, "T. Egerton", 1813, 1, "Jane Austen");
        bookLibrary[7][2] = new Book("1984", 328, "Secker & Warburg", 1949, 1, "George Orwell");
        bookLibrary[7][3] = new Book("The Great Gatsby", 180, "Charles Scribner's Sons", 1925, 1, "F. Scott Fitzgerald");
        bookLibrary[7][4] = new Book("Moby Dick", 585, "Harper & Brothers", 1851, 1, "Herman Melville");
        bookLibrary[7][5] = new Book("War and Peace", 1225, "The Russian Messenger", 1869, 1, "Leo Tolstoy");
        bookLibrary[7][6] = new Book("Anna Karenina", 864, "The Russian Messenger", 1877, 1, "Leo Tolstoy");
        bookLibrary[7][7] = new Book("The Catcher in the Rye", 277, "Little, Brown and Company", 1951, 1, "J.D. Salinger");
        bookLibrary[7][8] = new Book("The Odyssey", 560, "Penguin Classics", -700, 1, "Homer");
        bookLibrary[7][9] = new Book("The Iliad", 704, "Penguin Classics", -750, 1, "Homer");
        bookLibrary[7][10] = new Book("Crime and Punishment", 671, "The Russian Messenger", 1866, 1, "Fyodor Dostoevsky");
        bookLibrary[7][11] = new Book("Jane Eyre", 500, "Smith, Elder & Co.", 1847, 1, "Charlotte Brontë");
        bookLibrary[7][12] = new Book("Wuthering Heights", 416, "Thomas Cautley Newby", 1847, 1, "Emily Brontë");
        bookLibrary[7][13] = new Book("Don Quixote", 940, "Francisco de Robles", 1605, 1, "Miguel de Cervantes");
        bookLibrary[7][14] = new Book("The Brothers Karamazov", 796, "The Russian Messenger", 1880, 1, "Fyodor Dostoevsky");
        bookLibrary[7][15] = new Book("Les Misérables", 1232, "A. Lacroix, Verboeckhoven & Cie", 1862, 1, "Victor Hugo");
        bookLibrary[7][16] = new Book("The Divine Comedy", 798, "Penguin Classics", 1320, 1, "Dante Alighieri");
        bookLibrary[7][17] = new Book("Frankenstein", 280, "Lackington, Hughes, Harding, Mavor & Jones", 1818, 1, "Mary Shelley");
        bookLibrary[7][18] = new Book("Dracula", 418, "Archibald Constable and Company", 1897, 1, "Bram Stoker");
        bookLibrary[7][19] = new Book("The Picture of Dorian Gray", 254, "Ward, Lock & Co.", 1890, 1, "Oscar Wilde");


        bookLibrary[8][0] = new Book("The Story of Art", 688, "Phaidon", 1950, 16, "E.H. Gombrich");
        bookLibrary[8][1] = new Book("Ways of Seeing", 176, "Penguin", 1972, 1, "John Berger");
        bookLibrary[8][2] = new Book("Art Through the Ages", 1256, "Thomson", 2004, 11, "Helen Gardner");
        bookLibrary[8][3] = new Book("The Lives of the Artists", 480, "Penguin Classics", 1550, 1, "Giorgio Vasari");
        bookLibrary[8][4] = new Book("History of Modern Art", 848, "Prentice Hall", 2010, 7, "H.H. Arnason");
        bookLibrary[8][5] = new Book("The Letters of Vincent van Gogh", 416, "Penguin Classics", 1987, 1, "Vincent van Gogh");
        bookLibrary[8][6] = new Book("Art and Illusion", 512, "Princeton University Press", 2000, 2, "E.H. Gombrich");
        bookLibrary[8][7] = new Book("Shock of the New", 448, "Thames & Hudson", 2004, 1, "Robert Hughes");
        bookLibrary[8][8] = new Book("Art: A World History", 576, "DK", 1997, 1, "Elke Linda Buchholz");
        bookLibrary[8][9] = new Book("The Art Book", 592, "Phaidon", 1994, 1, "Editors of Phaidon Press");
        bookLibrary[8][10] = new Book("Art Since 1900", 712, "Thames & Hudson", 2004, 1, "Hal Foster");
        bookLibrary[8][11] = new Book("The Paintings That Revolutionized Art", 256, "Prestel", 2007, 1, "Claudia Stauble");
        bookLibrary[8][12] = new Book("What Are You Looking At?", 464, "Plume", 2013, 1, "Will Gompertz");
        bookLibrary[8][13] = new Book("The Art Spirit", 276, "J.B. Lippincott", 1923, 1, "Robert Henri");
        bookLibrary[8][14] = new Book("The Power of Art", 480, "BBC Books", 2006, 1, "Simon Schama");
        bookLibrary[8][15] = new Book("The Art of War", 273, "Oxford University Press", -500, 1, "Sun Tzu");
        bookLibrary[8][16] = new Book("The Art of Looking", 256, "Penguin", 2018, 1, "Lance Esplund");
        bookLibrary[8][17] = new Book("Modern Art", 384, "Oxford University Press", 1992, 1, "Norbert Lynton");
        bookLibrary[8][18] = new Book("The Art of Rivalry", 416, "Bloomsbury", 2016, 1, "Sebastian Smee");
        bookLibrary[8][19] = new Book("Art and Visual Perception", 512, "University of California Press", 1954, 1, "Rudolf Arnheim");


        bookLibrary[9][0] = new Book("The Rest is Noise", 624, "Picador", 2008, 1, "Alex Ross");
        bookLibrary[9][1] = new Book("This Is Your Brain on Music", 320, "Plume", 2006, 1, "Daniel J. Levitin");
        bookLibrary[9][2] = new Book("How Music Works", 352, "McSweeney's", 2012, 1, "David Byrne");
        bookLibrary[9][3] = new Book("Musicophilia: Tales of Music and the Brain", 400, "Vintage", 2007, 1, "Oliver Sacks");
        bookLibrary[9][4] = new Book("The Oxford History of Western Music", 1800, "Oxford University Press", 2005, 1, "Richard Taruskin");
        bookLibrary[9][5] = new Book("What to Listen for in Music", 288, "Signet", 1957, 1, "Aaron Copland");
        bookLibrary[9][6] = new Book("All You Need to Know About the Music Business", 528, "Simon & Schuster", 2015, 9, "Donald S. Passman");
        bookLibrary[9][7] = new Book("The History of Classical Music", 352, "Naxos Books", 2004, 1, "Richard Fawkes");
        bookLibrary[9][8] = new Book("Can't Stop Won't Stop: A History of the Hip-Hop Generation", 560, "Picador", 2005, 1, "Jeff Chang");
        bookLibrary[9][9] = new Book("Miles: The Autobiography", 440, "Simon & Schuster", 1990, 1, "Miles Davis");
        bookLibrary[9][10] = new Book("The Complete Beatles Recording Sessions", 204, "Hamlyn", 1988, 1, "Mark Lewisohn");
        bookLibrary[9][11] = new Book("Beethoven: Anguish and Triumph", 1040, "Houghton Mifflin Harcourt", 2014, 1, "Jan Swafford");
        bookLibrary[9][12] = new Book("The Lives of the Great Composers", 864, "W.W. Norton & Company", 1997, 3, "Harold C. Schonberg");
        bookLibrary[9][13] = new Book("The Power of Music", 480, "Vintage", 2010, 1, "Elena Mannes");
        bookLibrary[9][14] = new Book("The Song Machine: Inside the Hit Factory", 288, "W.W. Norton", 2015, 1, "John Seabrook");
        bookLibrary[9][15] = new Book("Good Vibrations: My Life as a Beach Boy", 432, "Blue Rider Press", 2016, 1, "Mike Love");
        bookLibrary[9][16] = new Book("Perfecting Sound Forever: An Aural History of Recorded Music", 372, "Faber & Faber", 2009, 1, "Greg Milner");
        bookLibrary[9][17] = new Book("The Music Instinct", 464, "Oxford University Press", 2010, 1, "Philip Ball");
        bookLibrary[9][18] = new Book("Understanding Music", 528, "Pearson", 2013, 8, "Jeremy Yudkin");
        bookLibrary[9][19] = new Book("Listen to This", 384, "Picador", 2010, 1, "Alex Ross");


        bookLibrary[10][0] = new Book("The Republic", 416, "Penguin Classics", 380, 1, "Plato");
        bookLibrary[10][1] = new Book("Beyond Good and Evil", 288, "Cambridge", 1886, 1, "Friedrich Nietzsche");
        bookLibrary[10][2] = new Book("Meditations", 254, "Modern Library", 167, 1, "Marcus Aurelius");
        bookLibrary[10][3] = new Book("Critique of Pure Reason", 856, "Cambridge", 1781, 1, "Immanuel Kant");
        bookLibrary[10][4] = new Book("Being and Time", 589, "Harper Perennial", 1927, 1, "Martin Heidegger");
        bookLibrary[10][5] = new Book("The Phenomenology of Spirit", 640, "Oxford University Press", 1807, 1, "G.W.F. Hegel");
        bookLibrary[10][6] = new Book("The World as Will and Representation", 720, "Dover", 1818, 1, "Arthur Schopenhauer");
        bookLibrary[10][7] = new Book("Nicomachean Ethics", 329, "Oxford Classics", -350, 1, "Aristotle");
        bookLibrary[10][8] = new Book("The Social Contract", 240, "Penguin Classics", 1762, 1, "Jean-Jacques Rousseau");
        bookLibrary[10][9] = new Book("Leviathan", 736, "Penguin Classics", 1651, 1, "Thomas Hobbes");
        bookLibrary[10][10] = new Book("Thus Spoke Zarathustra", 352, "Penguin Classics", 1883, 1, "Friedrich Nietzsche");
        bookLibrary[10][11] = new Book("The Trial and Death of Socrates", 384, "Hackett Publishing", -399, 1, "Plato");
        bookLibrary[10][12] = new Book("A History of Western Philosophy", 842, "Routledge", 1945, 1, "Bertrand Russell");
        bookLibrary[10][13] = new Book("The Gay Science", 416, "Vintage", 1882, 1, "Friedrich Nietzsche");
        bookLibrary[10][14] = new Book("Ethics", 314, "Penguin Classics", 1677, 1, "Baruch Spinoza");
        bookLibrary[10][15] = new Book("On Liberty", 304, "Penguin Classics", 1859, 1, "John Stuart Mill");
        bookLibrary[10][16] = new Book("Simulacra and Simulation", 176, "University of Michigan Press", 1981, 1, "Jean Baudrillard");
        bookLibrary[10][17] = new Book("The Second Sex", 800, "Vintage", 1949, 1, "Simone de Beauvoir");
        bookLibrary[10][18] = new Book("Tractatus Logico-Philosophicus", 200, "Routledge", 1921, 1, "Ludwig Wittgenstein");
        bookLibrary[10][19] = new Book("An Enquiry Concerning Human Understanding", 192, "Hackett", 1748, 1, "David Hume");


        bookLibrary[11][0] = new Book("Thinking, Fast and Slow", 512, "Farrar, Straus and Giroux", 2011, 1, "Daniel Kahneman");
        bookLibrary[11][1] = new Book("The Power of Habit", 371, "Random House", 2012, 1, "Charles Duhigg");
        bookLibrary[11][2] = new Book("Man's Search for Meaning", 200, "Beacon Press", 1946, 1, "Viktor E. Frankl");
        bookLibrary[11][3] = new Book("Influence: The Psychology of Persuasion", 320, "Harper Business", 1984, 1, "Robert B. Cialdini");
        bookLibrary[11][4] = new Book("The Emotional Brain", 384, "Simon & Schuster", 1996, 1, "Joseph E. LeDoux");
        bookLibrary[11][5] = new Book("The Social Animal", 736, "Worth Publishers", 2010, 11, "Elliot Aronson");
        bookLibrary[11][6] = new Book("Grit: The Power of Passion and Perseverance", 352, "Scribner", 2016, 1, "Angela Duckworth");
        bookLibrary[11][7] = new Book("The Righteous Mind", 448, "Pantheon Books", 2012, 1, "Jonathan Haidt");
        bookLibrary[11][8] = new Book("Blink: The Power of Thinking Without Thinking", 320, "Little, Brown", 2005, 1, "Malcolm Gladwell");
        bookLibrary[11][9] = new Book("Quiet: The Power of Introverts in a World That Can't Stop Talking", 368, "Crown", 2012, 1, "Susan Cain");
        bookLibrary[11][10] = new Book("Mindset: The New Psychology of Success", 320, "Ballantine Books", 2006, 1, "Carol S. Dweck");
        bookLibrary[11][11] = new Book("Flow: The Psychology of Optimal Experience", 336, "Harper Perennial", 1990, 1, "Mihaly Csikszentmihalyi");
        bookLibrary[11][12] = new Book("The Body Keeps the Score", 464, "Penguin Books", 2014, 1, "Bessel van der Kolk");
        bookLibrary[11][13] = new Book("Predictably Irrational", 304, "Harper Perennial", 2008, 1, "Dan Ariely");
        bookLibrary[11][14] = new Book("The Happiness Hypothesis", 320, "Basic Books", 2006, 1, "Jonathan Haidt");
        bookLibrary[11][15] = new Book("Stumbling on Happiness", 336, "Vintage", 2006, 1, "Daniel Gilbert");
        bookLibrary[11][16] = new Book("Drive: The Surprising Truth About What Motivates Us", 256, "Riverhead Books", 2009, 1, "Daniel H. Pink");
        bookLibrary[11][17] = new Book("The Interpretation of Dreams", 688, "Macmillan", 1899, 1, "Sigmund Freud");
        bookLibrary[11][18] = new Book("The Archetypes and the Collective Unconscious", 448, "Princeton University Press", 1959, 1, "Carl Gustav Jung");
        bookLibrary[11][19] = new Book("Emotional Intelligence", 352, "Bantam", 1995, 1, "Daniel Goleman");

        
        bookLibrary[12][0] = new Book("The Prince", 140, "Penguin Classics", 1532, 1, "Niccolò Machiavelli");
        bookLibrary[12][1] = new Book("The Communist Manifesto", 48, "Penguin Classics", 1848, 1, "Karl Marx & Friedrich Engels");
        bookLibrary[12][2] = new Book("Leviathan", 736, "Penguin Classics", 1651, 1, "Thomas Hobbes");
        bookLibrary[12][3] = new Book("On Liberty", 304, "Penguin Classics", 1859, 1, "John Stuart Mill");
        bookLibrary[12][4] = new Book("The Federalist Papers", 608, "Signet Classics", 1788, 1, "Alexander Hamilton, James Madison, John Jay");
        bookLibrary[12][5] = new Book("The Origins of Totalitarianism", 576, "Harcourt", 1951, 1, "Hannah Arendt");
        bookLibrary[12][6] = new Book("Democracy in America", 992, "Library of America", 1835, 1, "Alexis de Tocqueville");
        bookLibrary[12][7] = new Book("The Road to Serfdom", 288, "University of Chicago Press", 1944, 1, "F.A. Hayek");
        bookLibrary[12][8] = new Book("Politics", 368, "Oxford University Press", -350, 1, "Aristotle");
        bookLibrary[12][9] = new Book("The Clash of Civilizations", 368, "Simon & Schuster", 1996, 1, "Samuel P. Huntington");
        bookLibrary[12][10] = new Book("The End of History and the Last Man", 464, "Free Press", 1992, 1, "Francis Fukuyama");
        bookLibrary[12][11] = new Book("Discipline and Punish", 352, "Vintage", 1975, 1, "Michel Foucault");
        bookLibrary[12][12] = new Book("Capitalism and Freedom", 208, "University of Chicago Press", 1962, 1, "Milton Friedman");
        bookLibrary[12][13] = new Book("The Open Society and Its Enemies", 376, "Routledge", 1945, 1, "Karl Popper");
        bookLibrary[12][14] = new Book("The Rights of Man", 544, "Penguin Classics", 1791, 1, "Thomas Paine");
        bookLibrary[12][15] = new Book("Common Sense", 48, "Dover Publications", 1776, 1, "Thomas Paine");
        bookLibrary[12][16] = new Book("A Theory of Justice", 624, "Belknap Press", 1971, 1, "John Rawls");
        bookLibrary[12][17] = new Book("Justice as Fairness", 240, "Belknap Press", 2001, 1, "John Rawls");
        bookLibrary[12][18] = new Book("The Wealth of Nations", 1264, "Modern Library", 1776, 1, "Adam Smith");
        bookLibrary[12][19] = new Book("The Spirit of the Laws", 944, "Cambridge University Press", 1748, 1, "Montesquieu");

        
        bookLibrary[13][0] = new Book("The Wealth of Nations", 1264, "Modern Library", 1776, 1, "Adam Smith");
        bookLibrary[13][1] = new Book("Capital in the Twenty-First Century", 816, "Belknap Press", 2013, 1, "Thomas Piketty");
        bookLibrary[13][2] = new Book("The General Theory of Employment, Interest, and Money", 472, "Macmillan", 1936, 1, "John Maynard Keynes");
        bookLibrary[13][3] = new Book("Freakonomics", 320, "William Morrow", 2005, 1, "Steven D. Levitt & Stephen J. Dubner");
        bookLibrary[13][4] = new Book("Thinking, Fast and Slow", 512, "Farrar, Straus and Giroux", 2011, 1, "Daniel Kahneman");
        bookLibrary[13][5] = new Book("Basic Economics", 704, "Basic Books", 2014, 5, "Thomas Sowell");
        bookLibrary[13][6] = new Book("Poor Economics", 320, "PublicAffairs", 2011, 1, "Abhijit Banerjee & Esther Duflo");
        bookLibrary[13][7] = new Book("The Road to Serfdom", 288, "University of Chicago Press", 1944, 1, "F.A. Hayek");
        bookLibrary[13][8] = new Book("The Big Short", 320, "W.W. Norton", 2010, 1, "Michael Lewis");
        bookLibrary[13][9] = new Book("Misbehaving: The Making of Behavioral Economics", 416, "W.W. Norton", 2015, 1, "Richard H. Thaler");
        bookLibrary[13][10] = new Book("Debt: The First 5000 Years", 544, "Melville House", 2011, 1, "David Graeber");
        bookLibrary[13][11] = new Book("Nudge: Improving Decisions About Health, Wealth, and Happiness", 312, "Penguin", 2008, 1, "Richard H. Thaler & Cass R. Sunstein");
        bookLibrary[13][12] = new Book("Why Nations Fail", 544, "Crown", 2012, 1, "Daron Acemoglu & James A. Robinson");
        bookLibrary[13][13] = new Book("An Inquiry into the Nature and Causes of the Wealth of Nations", 1264, "Liberty Fund", 1776, 1, "Adam Smith");
        bookLibrary[13][14] = new Book("Animal Spirits", 264, "Princeton University Press", 2009, 1, "George Akerlof & Robert Shiller");
        bookLibrary[13][15] = new Book("Fooled by Randomness", 368, "Penguin", 2004, 1, "Nassim Nicholas Taleb");
        bookLibrary[13][16] = new Book("The Black Swan", 444, "Random House", 2007, 1, "Nassim Nicholas Taleb");
        bookLibrary[13][17] = new Book("Das Kapital", 1152, "Penguin Classics", 1867, 1, "Karl Marx");
        bookLibrary[13][18] = new Book("The Shock Doctrine", 672, "Metropolitan Books", 2007, 1, "Naomi Klein");
        bookLibrary[13][19] = new Book("Globalization and Its Discontents", 304, "W.W. Norton", 2002, 1, "Joseph E. Stiglitz");

        
        bookLibrary[14][0] = new Book("The Emperor of All Maladies", 608, "Scribner", 2010, 1, "Siddhartha Mukherjee");
        bookLibrary[14][1] = new Book("Being Mortal", 304, "Metropolitan Books", 2014, 1, "Atul Gawande");
        bookLibrary[14][2] = new Book("The Gene: An Intimate History", 592, "Scribner", 2016, 1, "Siddhartha Mukherjee");
        bookLibrary[14][3] = new Book("Complications: A Surgeon's Notes on an Imperfect Science", 288, "Picador", 2002, 1, "Atul Gawande");
        bookLibrary[14][4] = new Book("Do No Harm: Stories of Life, Death, and Brain Surgery", 288, "Picador", 2014, 1, "Henry Marsh");
        bookLibrary[14][5] = new Book("The Immortal Life of Henrietta Lacks", 381, "Crown", 2010, 1, "Rebecca Skloot");
        bookLibrary[14][6] = new Book("Gray's Anatomy", 1600, "Churchill Livingstone", 1858, 41, "Henry Gray");
        bookLibrary[14][7] = new Book("When Breath Becomes Air", 256, "Random House", 2016, 1, "Paul Kalanithi");
        bookLibrary[14][8] = new Book("How Doctors Think", 320, "Mariner Books", 2007, 1, "Jerome Groopman");
        bookLibrary[14][9] = new Book("The Checklist Manifesto", 224, "Metropolitan Books", 2009, 1, "Atul Gawande");
        bookLibrary[14][10] = new Book("Pulse: Stories from the Heart of Medicine", 192, "Pegasus Books", 2018, 1, "Paul Gross");
        bookLibrary[14][11] = new Book("The Body Keeps the Score", 464, "Penguin Books", 2014, 1, "Bessel van der Kolk");
        bookLibrary[14][12] = new Book("Stiff: The Curious Lives of Human Cadavers", 320, "W.W. Norton", 2003, 1, "Mary Roach");
        bookLibrary[14][13] = new Book("Pandemic: Tracking Contagions", 288, "Sarah Crichton Books", 2016, 1, "Sonia Shah");
        bookLibrary[14][14] = new Book("Pathophysiology of Disease: An Introduction to Clinical Medicine", 784, "McGraw Hill", 2014, 7, "Gary D. Hammer");
        bookLibrary[14][15] = new Book("Harrison's Principles of Internal Medicine", 3000, "McGraw Hill", 2022, 21, "Dennis L. Kasper");
        bookLibrary[14][16] = new Book("First, Do No Harm", 320, "Random House", 1997, 1, "Lisa Belkin");
        bookLibrary[14][17] = new Book("Medical Microbiology", 864, "Elsevier", 2018, 9, "Patrick R. Murray");
        bookLibrary[14][18] = new Book("Netter's Atlas of Human Anatomy", 712, "Elsevier", 2018, 7, "Frank H. Netter");
        bookLibrary[14][19] = new Book("Essentials of Clinical Examination Handbook", 472, "F.A. Davis Company", 2016, 7, "Joshua J. Klein");

        
        bookLibrary[15][0] = new Book("Engineering Mechanics: Dynamics", 688, "Pearson", 2016, 14, "J.L. Meriam & L.G. Kraige");
        bookLibrary[15][1] = new Book("Introduction to Fluid Mechanics", 816, "Wiley", 2015, 8, "Robert W. Fox & Alan T. McDonald");
        bookLibrary[15][2] = new Book("Mechanics of Materials", 896, "Cengage Learning", 2021, 10, "James M. Gere & Barry J. Goodno");
        bookLibrary[15][3] = new Book("Thermodynamics: An Engineering Approach", 1056, "McGraw-Hill", 2014, 8, "Yunus Çengel & Michael Boles");
        bookLibrary[15][4] = new Book("Fundamentals of Electrical Engineering", 672, "Pearson", 2020, 5, "Leonard S. Bobrow");
        bookLibrary[15][5] = new Book("Engineering Economy", 736, "Pearson", 2020, 17, "William G. Sullivan");
        bookLibrary[15][6] = new Book("Introduction to Algorithms", 1292, "MIT Press", 2009, 3, "Thomas H. Cormen & Charles E. Leiserson");
        bookLibrary[15][7] = new Book("Structural Analysis", 912, "Cengage Learning", 2020, 10, "Russell C. Hibbeler");
        bookLibrary[15][8] = new Book("Materials Science and Engineering", 976, "Wiley", 2018, 10, "William D. Callister Jr.");
        bookLibrary[15][9] = new Book("Introduction to Environmental Engineering", 704, "McGraw-Hill", 2014, 5, "Mackenzie Davis & David Cornwell");
        bookLibrary[15][10] = new Book("Control Systems Engineering", 944, "Wiley", 2018, 8, "Norman S. Nise");
        bookLibrary[15][11] = new Book("Shigley's Mechanical Engineering Design", 1056, "McGraw-Hill", 2021, 11, "Richard G. Budynas & J. Keith Nisbett");
        bookLibrary[15][12] = new Book("Introduction to Heat Transfer", 896, "Wiley", 2017, 7, "Frank P. Incropera & David P. DeWitt");
        bookLibrary[15][13] = new Book("Engineering Mathematics", 1200, "Pearson", 2017, 7, "K.A. Stroud");
        bookLibrary[15][14] = new Book("Principles of Geotechnical Engineering", 704, "Cengage Learning", 2020, 9, "Braja M. Das");
        bookLibrary[15][15] = new Book("Water Resources Engineering", 896, "Pearson", 2012, 2, "Larry W. Mays");
        bookLibrary[15][16] = new Book("Fundamentals of Aerodynamics", 864, "McGraw-Hill", 2020, 6, "John D. Anderson Jr.");
        bookLibrary[15][17] = new Book("Transportation Engineering and Planning", 816, "Pearson", 2004, 3, "C.S. Papacostas");
        bookLibrary[15][18] = new Book("Introduction to Biomedical Engineering", 1248, "Academic Press", 2014, 3, "John Enderle & Joseph Bronzino");
        bookLibrary[15][19] = new Book("The Art of Electronics", 1224, "Cambridge University Press", 2015, 3, "Paul Horowitz & Winfield Hill");

        
        bookLibrary[16][0] = new Book("Towards a New Architecture", 320, "Dover Publications", 1923, 1, "Le Corbusier");
        bookLibrary[16][1] = new Book("The Architecture of Happiness", 280, "Vintage", 2006, 1, "Alain de Botton");
        bookLibrary[16][2] = new Book("Form, Space, and Order", 432, "Wiley", 2007, 4, "Francis D.K. Ching");
        bookLibrary[16][3] = new Book("The Four Books of Architecture", 254, "Dover Publications", 1570, 1, "Andrea Palladio");
        bookLibrary[16][4] = new Book("Delirious New York", 320, "Monacelli Press", 1978, 1, "Rem Koolhaas");
        bookLibrary[16][5] = new Book("S,M,L,XL", 1344, "Monacelli Press", 1995, 1, "Rem Koolhaas");
        bookLibrary[16][6] = new Book("Modern Architecture: A Critical History", 424, "Thames & Hudson", 1980, 4, "Kenneth Frampton");
        bookLibrary[16][7] = new Book("101 Things I Learned in Architecture School", 216, "MIT Press", 2007, 1, "Matthew Frederick");
        bookLibrary[16][8] = new Book("The Eyes of the Skin: Architecture and the Senses", 128, "Wiley", 1996, 1, "Juhani Pallasmaa");
        bookLibrary[16][9] = new Book("Architectural Graphics", 272, "Wiley", 2015, 6, "Francis D.K. Ching");
        bookLibrary[16][10] = new Book("The Death and Life of Great American Cities", 480, "Random House", 1961, 1, "Jane Jacobs");
        bookLibrary[16][11] = new Book("Building Construction Illustrated", 480, "Wiley", 2014, 5, "Francis D.K. Ching");
        bookLibrary[16][12] = new Book("A History of Western Architecture", 736, "Laurence King Publishing", 1994, 6, "David Watkin");
        bookLibrary[16][13] = new Book("Architecture: Form, Space, and Order", 464, "Wiley", 2015, 4, "Francis D.K. Ching");
        bookLibrary[16][14] = new Book("Brunelleschi's Dome", 192, "Bloomsbury Publishing", 2000, 1, "Ross King");
        bookLibrary[16][15] = new Book("The Future of Architecture in 100 Buildings", 232, "TED Books", 2015, 1, "Marc Kushner");
        bookLibrary[16][16] = new Book("Vitruvius: The Ten Books on Architecture", 336, "Dover Publications", -15, 1, "Vitruvius");
        bookLibrary[16][17] = new Book("Complexity and Contradiction in Architecture", 136, "MoMA", 1966, 1, "Robert Venturi");
        bookLibrary[16][18] = new Book("Learning from Las Vegas", 192, "MIT Press", 1972, 1, "Robert Venturi, Denise Scott Brown, Steven Izenour");
        bookLibrary[16][19] = new Book("Architecture Depends", 240, "MIT Press", 2009, 1, "Jeremy Till");

        
        bookLibrary[17][0] = new Book("The Sociological Imagination", 256, "Oxford University Press", 1959, 1, "C. Wright Mills");
        bookLibrary[17][1] = new Book("Society and Culture", 432, "Princeton University Press", 1992, 1, "Talcott Parsons");
        bookLibrary[17][2] = new Book("Suicide: A Study in Sociology", 416, "Free Press", 1897, 1, "Émile Durkheim");
        bookLibrary[17][3] = new Book("The Division of Labor in Society", 400, "Free Press", 1893, 1, "Émile Durkheim");
        bookLibrary[17][4] = new Book("The Protestant Ethic and the Spirit of Capitalism", 320, "Routledge", 1905, 1, "Max Weber");
        bookLibrary[17][5] = new Book("Capitalism and Modern Social Theory", 288, "Cambridge University Press", 1971, 1, "Anthony Giddens");
        bookLibrary[17][6] = new Book("Modernity and Self-Identity", 264, "Stanford University Press", 1991, 1, "Anthony Giddens");
        bookLibrary[17][7] = new Book("Distinction: A Social Critique of the Judgement of Taste", 640, "Harvard University Press", 1984, 1, "Pierre Bourdieu");
        bookLibrary[17][8] = new Book("The Presentation of Self in Everyday Life", 259, "Anchor", 1956, 1, "Erving Goffman");
        bookLibrary[17][9] = new Book("Social Theory and Modern Sociology", 288, "Stanford University Press", 1987, 1, "Anthony Giddens");
        bookLibrary[17][10] = new Book("Bowling Alone: The Collapse and Revival of American Community", 544, "Simon & Schuster", 2000, 1, "Robert D. Putnam");
        bookLibrary[17][11] = new Book("A General Theory of Society", 512, "Free Press", 1962, 1, "Talcott Parsons");
        bookLibrary[17][12] = new Book("Gender Trouble", 272, "Routledge", 1990, 1, "Judith Butler");
        bookLibrary[17][13] = new Book("Feminist Theory: From Margin to Center", 248, "South End Press", 1984, 1, "bell hooks");
        bookLibrary[17][14] = new Book("The Second Shift", 400, "Penguin Books", 1989, 1, "Arlie Russell Hochschild");
        bookLibrary[17][15] = new Book("Evicted: Poverty and Profit in the American City", 448, "Crown", 2016, 1, "Matthew Desmond");
        bookLibrary[17][16] = new Book("On the Run: Fugitive Life in an American City", 288, "University of Chicago Press", 2014, 1, "Alice Goffman");
        bookLibrary[17][17] = new Book("The Power Elite", 423, "Oxford University Press", 1956, 1, "C. Wright Mills");
        bookLibrary[17][18] = new Book("Habits of the Heart", 400, "University of California Press", 1985, 1, "Robert N. Bellah");
        bookLibrary[17][19] = new Book("Wealth and Poverty of Nations", 464, "W.W. Norton", 1998, 1, "David S. Landes");

        
        bookLibrary[18][0] = new Book("The Concept of Law", 320, "Oxford University Press", 1961, 1, "H.L.A. Hart");
        bookLibrary[18][1] = new Book("On the Law of War and Peace", 680, "Cambridge University Press", 1625, 1, "Hugo Grotius");
        bookLibrary[18][2] = new Book("Law's Empire", 470, "Harvard University Press", 1986, 1, "Ronald Dworkin");
        bookLibrary[18][3] = new Book("Introduction to the Study of the Law of the Constitution", 500, "Oxford University Press", 1885, 1, "A.V. Dicey");
        bookLibrary[18][4] = new Book("The Rule of Law", 352, "Penguin Books", 2010, 1, "Tom Bingham");
        bookLibrary[18][5] = new Book("An Introduction to Legal Reasoning", 112, "University of Chicago Press", 1949, 1, "Edward H. Levi");
        bookLibrary[18][6] = new Book("Letters to a Law Student", 368, "Oxford University Press", 2006, 1, "Nicholas McBride");
        bookLibrary[18][7] = new Book("Justice: What's the Right Thing to Do?", 320, "Farrar, Straus and Giroux", 2009, 1, "Michael J. Sandel");
        bookLibrary[18][8] = new Book("International Law", 640, "Oxford University Press", 2003, 6, "Malcolm N. Shaw");
        bookLibrary[18][9] = new Book("The Common Law", 416, "Harvard University Press", 1881, 1, "Oliver Wendell Holmes Jr.");
        bookLibrary[18][10] = new Book("The Rights of Man", 544, "Penguin Classics", 1791, 1, "Thomas Paine");
        bookLibrary[18][11] = new Book("The Spirit of the Laws", 944, "Cambridge University Press", 1748, 1, "Montesquieu");
        bookLibrary[18][12] = new Book("Constitutional and Administrative Law", 608, "Pearson", 2014, 9, "Hilaire Barnett");
        bookLibrary[18][13] = new Book("Criminal Law: Text, Cases, and Materials", 688, "Oxford University Press", 2014, 8, "Jonathan Herring");
        bookLibrary[18][14] = new Book("A Theory of Justice", 624, "Belknap Press", 1971, 1, "John Rawls");
        bookLibrary[18][15] = new Book("The Federalist Papers", 608, "Signet Classics", 1788, 1, "Alexander Hamilton, James Madison, John Jay");
        bookLibrary[18][16] = new Book("The Leviathan", 736, "Penguin Classics", 1651, 1, "Thomas Hobbes");
        bookLibrary[18][17] = new Book("Legal Traditions of the World", 624, "Oxford University Press", 2000, 4, "H. Patrick Glenn");
        bookLibrary[18][18] = new Book("The Nature of the Judicial Process", 180, "Yale University Press", 1921, 1, "Benjamin N. Cardozo");
        bookLibrary[18][19] = new Book("Understanding Law", 200, "Oxford University Press", 1999, 1, "John N. Adams & Roger Brownsword");

        
        bookLibrary[19][0] = new Book("The Bible", 1200, "Various Publishers", -400, 1, "Various Authors");
        bookLibrary[19][1] = new Book("The Quran", 604, "Various Publishers", 632, 1, "Various Authors");
        bookLibrary[19][2] = new Book("The Bhagavad Gita", 700, "Penguin Classics", -400, 1, "Vyasa");
        bookLibrary[19][3] = new Book("The Upanishads", 352, "Penguin Classics", -800, 1, "Various Authors");
        bookLibrary[19][4] = new Book("The Dhammapada", 144, "Oxford University Press", -300, 1, "Buddha");
        bookLibrary[19][5] = new Book("The Torah", 800, "Various Publishers", -1200, 1, "Various Authors");
        bookLibrary[19][6] = new Book("Mere Christianity", 227, "HarperOne", 1952, 1, "C.S. Lewis");
        bookLibrary[19][7] = new Book("The Varieties of Religious Experience", 544, "Penguin Classics", 1902, 1, "William James");
        bookLibrary[19][8] = new Book("The Tao Te Ching", 176, "Penguin Classics", -600, 1, "Laozi");
        bookLibrary[19][9] = new Book("City of God", 1092, "Penguin Classics", 426, 1, "Saint Augustine");
        bookLibrary[19][10] = new Book("The Divine Comedy", 798, "Penguin Classics", 1320, 1, "Dante Alighieri");
        bookLibrary[19][11] = new Book("Confessions", 400, "Oxford University Press", 398, 1, "Saint Augustine");
        bookLibrary[19][12] = new Book("God Is Not Great", 320, "Twelve", 2007, 1, "Christopher Hitchens");
        bookLibrary[19][13] = new Book("The Case for Christ", 336, "Zondervan", 1998, 1, "Lee Strobel");
        bookLibrary[19][14] = new Book("The Book of Mormon", 531, "Church of Jesus Christ of Latter-day Saints", 1830, 1, "Joseph Smith");
        bookLibrary[19][15] = new Book("The Teachings of the Buddha", 320, "Shambhala", 1994, 1, "Various Authors");
        bookLibrary[19][16] = new Book("The Life of Muhammad", 300, "Oxford University Press", 1858, 1, "Ibn Ishaq");
        bookLibrary[19][17] = new Book("The Essential Rumi", 416, "HarperOne", 1995, 1, "Jalal al-Din Rumi");
        bookLibrary[19][18] = new Book("The Power of Now", 236, "New World Library", 1997, 1, "Eckhart Tolle");
        bookLibrary[19][19] = new Book("Man's Search for Ultimate Meaning", 200, "Beacon Press", 1997, 1, "Viktor E. Frankl");

    }

    public static void main(String[] args) {
        final String RESET = "\u001B[0m"; 
   	    final String COLOR = "\u001B[91m"; 
   	    final String COLOR2 = "\u001B[93m";

   	    initializeLibrary();

        String[] categories = {		
        "1.  Computer Science", "2.  History", "3.  Geography", "4.  Mathematics", "5.  Physics", "6.  Chemistry",
        "7.  Biology", "8.  Literature","9.  Art", "10. Music", "11. Philosophy", "12. Psychology", "13. Politics",
        "14. Economics", "15. Medicine", "16. Engineering", "17. Architecture", "18. Sociology", "19. Law", "20. Religion"
        };

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(COLOR+"Select a category to view contents:\n"+RESET);

            for (int i = 0; i < categories.length; i++) {
                System.out.printf("%-24s", categories[i]);
                if ((i + 1) % 5 == 0) {
                    System.out.println();
                }
            }
            System.out.print(COLOR2+"\n\nEnter your choice (1-20, or -1 to exit): "+RESET);
            int choice = scanner.nextInt() - 1;
            if (choice == -2) {
                System.out.println(COLOR+"Thank you for using the system. Goodbye:)"+RESET);
                break;
            }
            if (choice < 0 || choice >= 20) {
                System.out.println("Invalid choice. Please select a valid category.");
                continue;
            }
            System.out.println(COLOR+"\nSelected Category Contents:\n"+RESET);

            for (int i = 0; i < 20; i++) {
                System.out.println(bookLibrary[choice][i].formattedInfo());
            }
            System.out.print(COLOR+"\nWould you like to view another category? (yes/no): "+RESET);
            scanner.nextLine(); 
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equalsIgnoreCase("no")) {
                System.out.println(COLOR2+"Thank you for using the system. See you later:) "+RESET);
                break;
            }
        }
        scanner.close();
    }
}