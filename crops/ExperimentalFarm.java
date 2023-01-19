//package crops;
//public class ExperimentalFarm {
//    private Plot[][] farmPlots;
//
//    public ExperimentalFarm(Plot[][] p) {
//
//        /* implementation not shown */
//
//    }
//
//    /** Returns the plot with the highest yield for a given crop type, as described in part (a). */
//    public Plot getHighestYield(String c){
//        Plot maxP = null; //max = 0
//        int maxY = -1; //-1 just in case there is no yield
//        for(int i = 0; i < farmPlots.length;i++){
//            for(int j = 0; j<farmPlots[0].length; j++){
//                Plot x = farmPlots[i][j];
//                if (x.getCropType().equals(c) && x.getCropYield()>maxY){
//                    maxY = x.getCropYield();
//                    maxP = x;
//                }
//            }
//        }
//        return maxP;
//    }
//
//    /** Returns true if all plots in a given column in the two-dimensional array farmPlots
//     * contain the same type of crop, or false otherwise, as described in part (b).
//     */
//
//    public boolean sameCrop(int col){
//        String init = farmPlots[0][col].getCropType();
//        for(int i = 1; i<farmPlots.length; i++){
//            String next = farmPlots[i][col].getCropType();
//            if(!init.equals(next)){
//                return false;
//            }
//        }
//        return true;}
//    }
//
//