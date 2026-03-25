package com.okinc.liveness.lca.debugtool.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaAiAlgoLivenessData {
    public static final int $stable = 8;

    @SerializedName("bad_image_score")
    private final String badImageScore;

    @SerializedName("challenges")
    private final List<Challenge> challenges;

    @SerializedName("extra_info")
    private final List<Object> extraInfo;

    @SerializedName("first_reference_frame")
    private final String firstReferenceFrame;

    @SerializedName("glasses_score")
    private final String glassesScore;

    @SerializedName("grimace_score")
    private final String grimaceScore;

    @SerializedName("last_reference_frame")
    private final String lastReferenceFrame;

    @SerializedName("light_accuracy")
    private final Double lightAccuracy;

    @SerializedName("light_correct")
    private final Double lightCorrect;

    @SerializedName("light_total")
    private final Integer lightTotal;

    @SerializedName("liveness_result")
    private final Boolean livenessResult;

    @SerializedName("pad_score")
    private final Double padScore;

    @SerializedName("prediction_border")
    private final Boolean predictionBorder;

    @SerializedName("prediction_color_sequence")
    private final Boolean predictionColorSequence;

    @SerializedName("prediction_face_qc")
    private final Boolean predictionFaceQc;

    @SerializedName("prediction_glasses")
    private final Boolean predictionGlasses;

    @SerializedName("prediction_good_lighting")
    private final Boolean predictionGoodLighting;

    @SerializedName("prediction_grimace")
    private final Boolean predictionGrimace;

    @SerializedName("prediction_pad")
    private final Boolean predictionPad;

    @SerializedName("prediction_same_person")
    private final Boolean predictionSamePerson;

    @SerializedName("request_id")
    private final String requestId;

    @SerializedName("video_size")
    private final Integer videoSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaAiAlgoLivenessData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.livenessResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component10() {
        return this.padScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component11() {
        return this.lightCorrect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.lightTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component13() {
        return this.lightAccuracy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.videoSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.glassesScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.grimaceScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.badImageScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component18() {
        return this.extraInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Challenge> component19() {
        return this.challenges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.predictionFaceQc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.firstReferenceFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.lastReferenceFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.predictionGlasses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.predictionGrimace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.predictionPad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.predictionGoodLighting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.predictionColorSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.predictionSamePerson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.predictionBorder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaAiAlgoLivenessData copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Double d, Double d2, Integer num, Double d3, Integer num2, String str, String str2, String str3, List<? extends Object> list, List<Challenge> list2, String str4, String str5, String str6) {
        return new LcaAiAlgoLivenessData(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, d, d2, num, d3, num2, str, str2, str3, list, list2, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaAiAlgoLivenessData)) {
            return false;
        }
        LcaAiAlgoLivenessData lcaAiAlgoLivenessData = (LcaAiAlgoLivenessData) obj;
        return Intrinsics.EZpvd(this.livenessResult, lcaAiAlgoLivenessData.livenessResult) && Intrinsics.EZpvd(this.predictionFaceQc, lcaAiAlgoLivenessData.predictionFaceQc) && Intrinsics.EZpvd(this.predictionGlasses, lcaAiAlgoLivenessData.predictionGlasses) && Intrinsics.EZpvd(this.predictionGrimace, lcaAiAlgoLivenessData.predictionGrimace) && Intrinsics.EZpvd(this.predictionPad, lcaAiAlgoLivenessData.predictionPad) && Intrinsics.EZpvd(this.predictionGoodLighting, lcaAiAlgoLivenessData.predictionGoodLighting) && Intrinsics.EZpvd(this.predictionColorSequence, lcaAiAlgoLivenessData.predictionColorSequence) && Intrinsics.EZpvd(this.predictionSamePerson, lcaAiAlgoLivenessData.predictionSamePerson) && Intrinsics.EZpvd(this.predictionBorder, lcaAiAlgoLivenessData.predictionBorder) && Intrinsics.EZpvd(this.padScore, lcaAiAlgoLivenessData.padScore) && Intrinsics.EZpvd(this.lightCorrect, lcaAiAlgoLivenessData.lightCorrect) && Intrinsics.EZpvd(this.lightTotal, lcaAiAlgoLivenessData.lightTotal) && Intrinsics.EZpvd(this.lightAccuracy, lcaAiAlgoLivenessData.lightAccuracy) && Intrinsics.EZpvd(this.videoSize, lcaAiAlgoLivenessData.videoSize) && Intrinsics.EZpvd((Object) this.glassesScore, (Object) lcaAiAlgoLivenessData.glassesScore) && Intrinsics.EZpvd((Object) this.grimaceScore, (Object) lcaAiAlgoLivenessData.grimaceScore) && Intrinsics.EZpvd((Object) this.badImageScore, (Object) lcaAiAlgoLivenessData.badImageScore) && Intrinsics.EZpvd(this.extraInfo, lcaAiAlgoLivenessData.extraInfo) && Intrinsics.EZpvd(this.challenges, lcaAiAlgoLivenessData.challenges) && Intrinsics.EZpvd((Object) this.requestId, (Object) lcaAiAlgoLivenessData.requestId) && Intrinsics.EZpvd((Object) this.firstReferenceFrame, (Object) lcaAiAlgoLivenessData.firstReferenceFrame) && Intrinsics.EZpvd((Object) this.lastReferenceFrame, (Object) lcaAiAlgoLivenessData.lastReferenceFrame);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBadImageScore() {
        return this.badImageScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Challenge> getChallenges() {
        return this.challenges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getExtraInfo() {
        return this.extraInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstReferenceFrame() {
        return this.firstReferenceFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGlassesScore() {
        return this.glassesScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGrimaceScore() {
        return this.grimaceScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastReferenceFrame() {
        return this.lastReferenceFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getLightAccuracy() {
        return this.lightAccuracy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getLightCorrect() {
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
    public final Double getPadScore() {
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
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVideoSize() {
        return this.videoSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.livenessResult;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.predictionFaceQc;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.predictionGlasses;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.predictionGrimace;
        int iHashCode4 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.predictionPad;
        int iHashCode5 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.predictionGoodLighting;
        int iHashCode6 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.predictionColorSequence;
        int iHashCode7 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.predictionSamePerson;
        int iHashCode8 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.predictionBorder;
        int iHashCode9 = bool9 == null ? 0 : bool9.hashCode();
        Double d = this.padScore;
        int iHashCode10 = d == null ? 0 : d.hashCode();
        Double d2 = this.lightCorrect;
        int iHashCode11 = d2 == null ? 0 : d2.hashCode();
        Integer num = this.lightTotal;
        int iHashCode12 = num == null ? 0 : num.hashCode();
        Double d3 = this.lightAccuracy;
        int iHashCode13 = d3 == null ? 0 : d3.hashCode();
        Integer num2 = this.videoSize;
        int iHashCode14 = num2 == null ? 0 : num2.hashCode();
        String str = this.glassesScore;
        int iHashCode15 = str == null ? 0 : str.hashCode();
        String str2 = this.grimaceScore;
        int iHashCode16 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.badImageScore;
        int iHashCode17 = str3 == null ? 0 : str3.hashCode();
        List<Object> list = this.extraInfo;
        int iHashCode18 = list == null ? 0 : list.hashCode();
        List<Challenge> list2 = this.challenges;
        int iHashCode19 = list2 == null ? 0 : list2.hashCode();
        String str4 = this.requestId;
        int iHashCode20 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.firstReferenceFrame;
        int iHashCode21 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.lastReferenceFrame;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str6 == null ? 0 : str6.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaAiAlgoLivenessData(livenessResult=" + this.livenessResult + ", predictionFaceQc=" + this.predictionFaceQc + ", predictionGlasses=" + this.predictionGlasses + ", predictionGrimace=" + this.predictionGrimace + ", predictionPad=" + this.predictionPad + ", predictionGoodLighting=" + this.predictionGoodLighting + ", predictionColorSequence=" + this.predictionColorSequence + ", predictionSamePerson=" + this.predictionSamePerson + ", predictionBorder=" + this.predictionBorder + ", padScore=" + this.padScore + ", lightCorrect=" + this.lightCorrect + ", lightTotal=" + this.lightTotal + ", lightAccuracy=" + this.lightAccuracy + ", videoSize=" + this.videoSize + ", glassesScore=" + this.glassesScore + ", grimaceScore=" + this.grimaceScore + ", badImageScore=" + this.badImageScore + ", extraInfo=" + this.extraInfo + ", challenges=" + this.challenges + ", requestId=" + this.requestId + ", firstReferenceFrame=" + this.firstReferenceFrame + ", lastReferenceFrame=" + this.lastReferenceFrame + ")";
    }

    public LcaAiAlgoLivenessData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Double d, Double d2, Integer num, Double d3, Integer num2, String str, String str2, String str3, List<? extends Object> list, List<Challenge> list2, String str4, String str5, String str6) {
        this.livenessResult = bool;
        this.predictionFaceQc = bool2;
        this.predictionGlasses = bool3;
        this.predictionGrimace = bool4;
        this.predictionPad = bool5;
        this.predictionGoodLighting = bool6;
        this.predictionColorSequence = bool7;
        this.predictionSamePerson = bool8;
        this.predictionBorder = bool9;
        this.padScore = d;
        this.lightCorrect = d2;
        this.lightTotal = num;
        this.lightAccuracy = d3;
        this.videoSize = num2;
        this.glassesScore = str;
        this.grimaceScore = str2;
        this.badImageScore = str3;
        this.extraInfo = list;
        this.challenges = list2;
        this.requestId = str4;
        this.firstReferenceFrame = str5;
        this.lastReferenceFrame = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f5: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x004a: ARITH (r46v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r33v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0052: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r34v0 java.lang.Double))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005a: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r35v0 java.lang.Integer))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0062: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r36v0 java.lang.Double))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006a: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r37v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0093: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r41v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x009e: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r42v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r46v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r46v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r46v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends java.lang.Object>, java.util.List<com.okinc.liveness.lca.debugtool.data.Challenge>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessData.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LcaAiAlgoLivenessData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Double d, Double d2, Integer num, Double d3, Integer num2, String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? null : bool8, (i & 256) != 0 ? null : bool9, (i & 512) != 0 ? null : d, (i & 1024) != 0 ? null : d2, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : d3, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : str, (i & 32768) != 0 ? null : str2, (i & 65536) != 0 ? null : str3, (i & 131072) != 0 ? null : list, (i & 262144) != 0 ? null : list2, (i & 524288) != 0 ? null : str4, (i & 1048576) != 0 ? null : str5, (i & 2097152) != 0 ? null : str6);
    }
}
