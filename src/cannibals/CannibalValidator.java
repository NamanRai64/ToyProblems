package cannibals;

public class CannibalValidator {

    public boolean isValidMove(int mL, int cL, int mR, int cR, int mMove, int cMove, boolean onLeft) {
        // 1. Boat Capacity (1 or 2 people)
        if (mMove + cMove < 1 || mMove + cMove > 2) return false;

        // 2. Check if enough people are on the starting shore
        if (onLeft) {
            if (mMove > mL || cMove > cL) return false;
        } else {
            if (mMove > mR || cMove > cR) return false;
        }

        return true;
    }

    public boolean isGameOver(int mL, int cL, int mR, int cR) {
        // Missionaries outnumbered on Left shore
        if (mL > 0 && cL > mL) return true;
        // Missionaries outnumbered on Right shore
        if (mR > 0 && cR > mR) return true;
        return false;
    }

}