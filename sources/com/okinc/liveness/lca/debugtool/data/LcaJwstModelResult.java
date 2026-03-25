package com.okinc.liveness.lca.debugtool.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJwstModelResult {
    public static final int $stable = 8;
    private final Float badImageScore;
    private final List<LcaColorChallenge> challenges;
    private final Float glassesScore;
    private final Float grimaceScore;
    private final Float lightAccuracy;
    private final Integer lightCorrect;
    private final Integer lightTotal;
    private final Boolean livenessResult;
    private final List<Float> padScore;
    private final Boolean predictionBorder;
    private final Boolean predictionColorSequence;
    private final Boolean predictionFaceQc;
    private final Boolean predictionGlasses;
    private final Boolean predictionGoodLighting;
    private final Boolean predictionGrimace;
    private final Boolean predictionPad;
    private final Boolean predictionSamePerson;
    private final Float samePersonScore1;
    private final Float samePersonScore2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.badImageScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.predictionBorder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.predictionColorSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.predictionFaceQc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.predictionGlasses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.predictionGoodLighting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.predictionGrimace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.predictionPad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.predictionSamePerson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component18() {
        return this.samePersonScore1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component19() {
        return this.samePersonScore2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LcaColorChallenge> component2() {
        return this.challenges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.glassesScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.grimaceScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.lightAccuracy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.lightCorrect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.lightTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.livenessResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Float> component9() {
        return this.padScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstModelResult copy(Float f, List<LcaColorChallenge> list, Float f2, Float f3, Float f4, Integer num, Integer num2, Boolean bool, List<Float> list2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Float f5, Float f6) {
        return new LcaJwstModelResult(f, list, f2, f3, f4, num, num2, bool, list2, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, f5, f6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaJwstModelResult)) {
            return false;
        }
        LcaJwstModelResult lcaJwstModelResult = (LcaJwstModelResult) obj;
        return Intrinsics.EZpvd(this.badImageScore, lcaJwstModelResult.badImageScore) && Intrinsics.EZpvd(this.challenges, lcaJwstModelResult.challenges) && Intrinsics.EZpvd(this.glassesScore, lcaJwstModelResult.glassesScore) && Intrinsics.EZpvd(this.grimaceScore, lcaJwstModelResult.grimaceScore) && Intrinsics.EZpvd(this.lightAccuracy, lcaJwstModelResult.lightAccuracy) && Intrinsics.EZpvd(this.lightCorrect, lcaJwstModelResult.lightCorrect) && Intrinsics.EZpvd(this.lightTotal, lcaJwstModelResult.lightTotal) && Intrinsics.EZpvd(this.livenessResult, lcaJwstModelResult.livenessResult) && Intrinsics.EZpvd(this.padScore, lcaJwstModelResult.padScore) && Intrinsics.EZpvd(this.predictionBorder, lcaJwstModelResult.predictionBorder) && Intrinsics.EZpvd(this.predictionColorSequence, lcaJwstModelResult.predictionColorSequence) && Intrinsics.EZpvd(this.predictionFaceQc, lcaJwstModelResult.predictionFaceQc) && Intrinsics.EZpvd(this.predictionGlasses, lcaJwstModelResult.predictionGlasses) && Intrinsics.EZpvd(this.predictionGoodLighting, lcaJwstModelResult.predictionGoodLighting) && Intrinsics.EZpvd(this.predictionGrimace, lcaJwstModelResult.predictionGrimace) && Intrinsics.EZpvd(this.predictionPad, lcaJwstModelResult.predictionPad) && Intrinsics.EZpvd(this.predictionSamePerson, lcaJwstModelResult.predictionSamePerson) && Intrinsics.EZpvd(this.samePersonScore1, lcaJwstModelResult.samePersonScore1) && Intrinsics.EZpvd(this.samePersonScore2, lcaJwstModelResult.samePersonScore2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getBadImageScore() {
        return this.badImageScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LcaColorChallenge> getChallenges() {
        return this.challenges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getGlassesScore() {
        return this.glassesScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getGrimaceScore() {
        return this.grimaceScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLightAccuracy() {
        return this.lightAccuracy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLightCorrect() {
        return this.lightCorrect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLightTotal() {
        return this.lightTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLivenessResult() {
        return this.livenessResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Float> getPadScore() {
        return this.padScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionBorder() {
        return this.predictionBorder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionColorSequence() {
        return this.predictionColorSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionFaceQc() {
        return this.predictionFaceQc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionGlasses() {
        return this.predictionGlasses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionGoodLighting() {
        return this.predictionGoodLighting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionGrimace() {
        return this.predictionGrimace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionPad() {
        return this.predictionPad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPredictionSamePerson() {
        return this.predictionSamePerson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getSamePersonScore1() {
        return this.samePersonScore1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getSamePersonScore2() {
        return this.samePersonScore2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.badImageScore;
        int iHashCode = f == null ? 0 : f.hashCode();
        List<LcaColorChallenge> list = this.challenges;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Float f2 = this.glassesScore;
        int iHashCode3 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.grimaceScore;
        int iHashCode4 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.lightAccuracy;
        int iHashCode5 = f4 == null ? 0 : f4.hashCode();
        Integer num = this.lightCorrect;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.lightTotal;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.livenessResult;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        List<Float> list2 = this.padScore;
        int iHashCode9 = list2 == null ? 0 : list2.hashCode();
        Boolean bool2 = this.predictionBorder;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.predictionColorSequence;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.predictionFaceQc;
        int iHashCode12 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.predictionGlasses;
        int iHashCode13 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.predictionGoodLighting;
        int iHashCode14 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.predictionGrimace;
        int iHashCode15 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.predictionPad;
        int iHashCode16 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.predictionSamePerson;
        int iHashCode17 = bool9 == null ? 0 : bool9.hashCode();
        Float f5 = this.samePersonScore1;
        int iHashCode18 = f5 == null ? 0 : f5.hashCode();
        Float f6 = this.samePersonScore2;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (f6 == null ? 0 : f6.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaJwstModelResult(badImageScore=" + this.badImageScore + ", challenges=" + this.challenges + ", glassesScore=" + this.glassesScore + ", grimaceScore=" + this.grimaceScore + ", lightAccuracy=" + this.lightAccuracy + ", lightCorrect=" + this.lightCorrect + ", lightTotal=" + this.lightTotal + ", livenessResult=" + this.livenessResult + ", padScore=" + this.padScore + ", predictionBorder=" + this.predictionBorder + ", predictionColorSequence=" + this.predictionColorSequence + ", predictionFaceQc=" + this.predictionFaceQc + ", predictionGlasses=" + this.predictionGlasses + ", predictionGoodLighting=" + this.predictionGoodLighting + ", predictionGrimace=" + this.predictionGrimace + ", predictionPad=" + this.predictionPad + ", predictionSamePerson=" + this.predictionSamePerson + ", samePersonScore1=" + this.samePersonScore1 + ", samePersonScore2=" + this.samePersonScore2 + ")";
    }

    public LcaJwstModelResult(Float f, List<LcaColorChallenge> list, Float f2, Float f3, Float f4, Integer num, Integer num2, Boolean bool, List<Float> list2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Float f5, Float f6) {
        this.badImageScore = f;
        this.challenges = list;
        this.glassesScore = f2;
        this.grimaceScore = f3;
        this.lightAccuracy = f4;
        this.lightCorrect = num;
        this.lightTotal = num2;
        this.livenessResult = bool;
        this.padScore = list2;
        this.predictionBorder = bool2;
        this.predictionColorSequence = bool3;
        this.predictionFaceQc = bool4;
        this.predictionGlasses = bool5;
        this.predictionGoodLighting = bool6;
        this.predictionGrimace = bool7;
        this.predictionPad = bool8;
        this.predictionSamePerson = bool9;
        this.samePersonScore1 = f5;
        this.samePersonScore2 = f6;
    }
}
