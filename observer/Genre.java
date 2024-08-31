
/**
 * The Genre enumeration represents the various genres of books.
 */

public enum Genre {
   FICTION("Fiction"),
   SCIENCE_FICTION("Science Fiction"),
   MYSTERY("Mystery"),
   THRILLER("Thriller"),
   NON_FICTION("Non Fiction"),
   HISTORICAL_FICTION("Historical Fiction"),
   ROMANCE("Romance");

   public final String label;

   /**
     * Constructs a new Genre instance.
     *
     * @param label the label of the genre.
     */
   
   private Genre(String label) {
      this.label = label;
   }
}
