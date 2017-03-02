/**
 * Created by dim3coder on 3/2/17.
 */
public class Arge {
  public static int nbYear(int p0, double percent, int aug, int p) {
    percent /= 100;
    int countOfYears = 0;
    int inhabitants = (int) (p0+(p0*percent)+aug);
    countOfYears++;
    while(inhabitants <p){
      inhabitants += (int)((inhabitants*percent)+aug);
      countOfYears++;
    }
    return countOfYears;
  }
}
