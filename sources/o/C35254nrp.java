package o;

import androidx.core.content.ContextCompat;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.im.message.MessageClusterType;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35254nrp {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public OKMessage AYXKKw;
    public boolean AhwBna;
    public java.lang.Integer AkhnZx;
    public java.lang.String AuCTel;
    public int DbNXlk;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public java.lang.Boolean copydefault;
    public java.lang.Boolean djBIcL;
    public java.lang.Integer fARcdN;
    public java.lang.Integer fJNWhG;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public java.lang.String isConnected;
    public MessageClusterType valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AkhnZx() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageClusterType copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35254nrp copydefault(@NotNull OKMessage oKMessage, boolean z, int i, boolean z2, MessageClusterType messageClusterType, java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2, boolean z3, java.lang.Integer num, java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes java.lang.Integer num2, int i2, java.lang.Integer num3, boolean z4, int i3) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new C35254nrp(oKMessage, z, i, z2, messageClusterType, bool, str, bool2, z3, num, str2, str3, num2, i2, num3, z4, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35254nrp)) {
            return false;
        }
        C35254nrp c35254nrp = (C35254nrp) obj;
        return Intrinsics.EZpvd(this.AYXKKw, c35254nrp.AYXKKw) && this.AEQbTJ == c35254nrp.AEQbTJ && this.values == c35254nrp.values && this.AhwBna == c35254nrp.AhwBna && this.valueOf == c35254nrp.valueOf && Intrinsics.EZpvd(this.djBIcL, c35254nrp.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c35254nrp.KWHzl) && Intrinsics.EZpvd(this.copydefault, c35254nrp.copydefault) && this.OLrzqt == c35254nrp.OLrzqt && Intrinsics.EZpvd(this.fJNWhG, c35254nrp.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c35254nrp.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c35254nrp.isConnected) && Intrinsics.EZpvd(this.AkhnZx, c35254nrp.AkhnZx) && this.DbNXlk == c35254nrp.DbNXlk && Intrinsics.EZpvd(this.fARcdN, c35254nrp.fARcdN) && this.gEmmrt == c35254nrp.gEmmrt && this.fetchVPNInfo == c35254nrp.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode3 = java.lang.Integer.hashCode(this.values);
        int iHashCode4 = java.lang.Boolean.hashCode(this.AhwBna);
        MessageClusterType messageClusterType = this.valueOf;
        int iHashCode5 = messageClusterType == null ? 0 : messageClusterType.hashCode();
        java.lang.Boolean bool = this.djBIcL;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool2 = this.copydefault;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode9 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.Integer num = this.fJNWhG;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.AuCTel;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.isConnected;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        java.lang.Integer num2 = this.AkhnZx;
        int iHashCode13 = num2 == null ? 0 : num2.hashCode();
        int iHashCode14 = java.lang.Integer.hashCode(this.DbNXlk);
        java.lang.Integer num3 = this.fARcdN;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (num3 == null ? 0 : num3.hashCode())) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean isConnected() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UIMessage(message=" + this.AYXKKw + ", isSelected=" + this.AEQbTJ + ", state=" + this.values + ", isShowMessageSendStatus=" + this.AhwBna + ", messageClusterType=" + this.valueOf + ", isShowReceiverAvatar=" + this.djBIcL + ", highlightText=" + this.KWHzl + ", isHighlightOnJump=" + this.copydefault + ", isShowIntervalTime=" + this.OLrzqt + ", voiceTotalDuration=" + this.fJNWhG + ", voiceRemainDuration=" + this.AuCTel + ", voiceDisplayDuration=" + this.isConnected + ", voicePlayStateIcon=" + this.AkhnZx + ", voiceMessageWidth=" + this.DbNXlk + ", voiceProgress=" + this.fARcdN + ", isShowUnreadDivider=" + this.gEmmrt + ", unreadIndicatorCount=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer valueOf() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.OLrzqt;
    }

    public C35254nrp(@NotNull OKMessage oKMessage, boolean z, int i, boolean z2, MessageClusterType messageClusterType, java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2, boolean z3, java.lang.Integer num, java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes java.lang.Integer num2, int i2, java.lang.Integer num3, boolean z4, int i3) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.AYXKKw = oKMessage;
        this.AEQbTJ = z;
        this.values = i;
        this.AhwBna = z2;
        this.valueOf = messageClusterType;
        this.djBIcL = bool;
        this.KWHzl = str;
        this.copydefault = bool2;
        this.OLrzqt = z3;
        this.fJNWhG = num;
        this.AuCTel = str2;
        this.isConnected = str3;
        this.AkhnZx = num2;
        this.DbNXlk = i2;
        this.fARcdN = num3;
        this.gEmmrt = z4;
        this.fetchVPNInfo = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ab: CONSTRUCTOR 
  (r18v0 com.okinc.okimcore.model.im.OKMessage)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:com.okinc.im.message.MessageClusterType:?: TERNARY null = ((wrap:int:0x001a: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.message.MessageClusterType) : (r22v0 com.okinc.im.message.MessageClusterType))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0044: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005c: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006c: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r32v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0076: ARITH (32768 int) & (r35v0 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007f: ARITH (r35v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
 A[MD:(com.okinc.okimcore.model.im.OKMessage, boolean, int, boolean, com.okinc.im.message.MessageClusterType, java.lang.Boolean, java.lang.String, java.lang.Boolean, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.Integer, boolean, int):void (m)] (LINE:21) call: o.nrp.<init>(com.okinc.okimcore.model.im.OKMessage, boolean, int, boolean, com.okinc.im.message.MessageClusterType, java.lang.Boolean, java.lang.String, java.lang.Boolean, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.Integer, boolean, int):void type: THIS */
    public /* synthetic */ C35254nrp(OKMessage oKMessage, boolean z, int i, boolean z2, MessageClusterType messageClusterType, java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2, boolean z3, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.Integer num2, int i2, java.lang.Integer num3, boolean z4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(oKMessage, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? null : messageClusterType, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? java.lang.Boolean.FALSE : bool2, (i4 & 256) != 0 ? false : z3, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : str2, (i4 & 2048) != 0 ? null : str3, (i4 & 4096) != 0 ? null : num2, (i4 & 8192) != 0 ? 0 : i2, (i4 & 16384) == 0 ? num3 : null, (32768 & i4) != 0 ? false : z4, (i4 & 65536) != 0 ? 0 : i3);
    }

    public final int AEQbTJ() {
        if (this.AYXKKw.getConversationType() == OKConversationType.PRIVATE) {
            return 8;
        }
        return Intrinsics.EZpvd(this.djBIcL, java.lang.Boolean.TRUE) ? 0 : 4;
    }

    /* JADX INFO: renamed from: o.nrp$Application */
    public static final class Application {

        /* JADX INFO: renamed from: o.nrp$Application$StateListAnimator */
        /* JADX INFO: loaded from: classes15.dex */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[MessageClusterType.values().length];
                try {
                    iArr[MessageClusterType.First.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                KWHzl = iArr;
                int[] iArr2 = new int[OKMessage.MessageDirection.values().length];
                try {
                    iArr2[OKMessage.MessageDirection.RECEIVE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr2[OKMessage.MessageDirection.SEND.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr2;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context, C35254nrp c35254nrp) {
            int i;
            OKMessage oKMessageOLrzqt;
            Intrinsics.checkNotNullParameter(context, "");
            OKMessage.MessageDirection messageDirection = (c35254nrp == null || (oKMessageOLrzqt = c35254nrp.OLrzqt()) == null) ? null : oKMessageOLrzqt.getMessageDirection();
            int i2 = messageDirection == null ? -1 : StateListAnimator.AEQbTJ[messageDirection.ordinal()];
            if (i2 == 1) {
                MessageClusterType messageClusterTypeCopydefault = c35254nrp.copydefault();
                i = (messageClusterTypeCopydefault != null && StateListAnimator.KWHzl[messageClusterTypeCopydefault.ordinal()] == 1) ? C44105sDn.Application.AYXKKw : C44105sDn.Application.AhwBna;
            } else if (i2 != 2) {
                i = C44105sDn.Application.valueOf;
            } else {
                MessageClusterType messageClusterTypeCopydefault2 = c35254nrp.copydefault();
                i = (messageClusterTypeCopydefault2 != null && StateListAnimator.KWHzl[messageClusterTypeCopydefault2.ordinal()] == 1) ? C44105sDn.Application.gEmmrt : C44105sDn.Application.djBIcL;
            }
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
            if (drawable != null) {
                return drawable.mutate();
            }
            return null;
        }

        public final int EZpvd(C35249nrk c35249nrk) {
            java.lang.Integer numValueOf = c35249nrk != null ? java.lang.Integer.valueOf(c35249nrk.OLrzqt()) : null;
            return (numValueOf != null && numValueOf.intValue() == 2) ? C44105sDn.Application.DbNXlk : C44105sDn.Application.isConnected;
        }

        public final int OLrzqt(@NotNull C35254nrp c35254nrp) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            OKMessage.MessageDirection messageDirection = c35254nrp.OLrzqt().getMessageDirection();
            OKMessage.MessageDirection messageDirection2 = OKMessage.MessageDirection.SEND;
            return (messageDirection == messageDirection2 && c35254nrp.copydefault() == MessageClusterType.First) ? C44105sDn.LoaderManager.OLrzqt : (c35254nrp.OLrzqt().getMessageDirection() == messageDirection2 && c35254nrp.copydefault() == MessageClusterType.Middle) ? C44105sDn.LoaderManager.KWHzl : (c35254nrp.OLrzqt().getMessageDirection() == OKMessage.MessageDirection.RECEIVE && c35254nrp.copydefault() == MessageClusterType.First) ? C44105sDn.LoaderManager.EZpvd : C44105sDn.LoaderManager.AEQbTJ;
        }

        public final int KWHzl(@NotNull C35254nrp c35254nrp) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            OKMessage.MessageDirection messageDirection = c35254nrp.OLrzqt().getMessageDirection();
            OKMessage.MessageDirection messageDirection2 = OKMessage.MessageDirection.SEND;
            return (messageDirection == messageDirection2 && c35254nrp.copydefault() == MessageClusterType.First) ? C44105sDn.LoaderManager.AhwBna : (c35254nrp.OLrzqt().getMessageDirection() == messageDirection2 && c35254nrp.copydefault() == MessageClusterType.Middle) ? C44105sDn.LoaderManager.gEmmrt : (c35254nrp.OLrzqt().getMessageDirection() == OKMessage.MessageDirection.RECEIVE && c35254nrp.copydefault() == MessageClusterType.First) ? C44105sDn.LoaderManager.copydefault : C44105sDn.LoaderManager.valueOf;
        }

        public final void copydefault(@NotNull ShapeableImageView shapeableImageView, int i, boolean z) {
            kotlin.Pair pairOLrzqt;
            kotlin.Pair pairOLrzqt2;
            Intrinsics.checkNotNullParameter(shapeableImageView, "");
            android.content.res.TypedArray typedArrayObtainStyledAttributes = shapeableImageView.getContext().obtainStyledAttributes(i, C44105sDn.FragmentManager.AEQbTJ);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            float dimension = typedArrayObtainStyledAttributes.getDimension(C44105sDn.FragmentManager.OLrzqt, 0.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(C44105sDn.FragmentManager.EZpvd, 0.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(C44105sDn.FragmentManager.copydefault, 0.0f);
            float dimension4 = typedArrayObtainStyledAttributes.getDimension(C44105sDn.FragmentManager.KWHzl, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            android.content.Context context = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            boolean zOLrzqt = C55296xhK.OLrzqt(context);
            if (zOLrzqt) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(dimension2), java.lang.Float.valueOf(dimension));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(dimension), java.lang.Float.valueOf(dimension2));
            }
            float fFloatValue = ((java.lang.Number) pairOLrzqt.component1()).floatValue();
            float fFloatValue2 = ((java.lang.Number) pairOLrzqt.component2()).floatValue();
            if (zOLrzqt) {
                pairOLrzqt2 = C56390yDp.OLrzqt(java.lang.Float.valueOf(dimension4), java.lang.Float.valueOf(dimension3));
            } else {
                pairOLrzqt2 = C56390yDp.OLrzqt(java.lang.Float.valueOf(dimension3), java.lang.Float.valueOf(dimension4));
            }
            float fFloatValue3 = ((java.lang.Number) pairOLrzqt2.component1()).floatValue();
            float fFloatValue4 = ((java.lang.Number) pairOLrzqt2.component2()).floatValue();
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            if (z) {
                builder.setTopLeftCorner(1, 0.0f).setTopRightCorner(1, 0.0f).setBottomLeftCornerSize(fFloatValue3).setBottomRightCornerSize(fFloatValue4);
            } else {
                builder.setTopLeftCornerSize(fFloatValue).setTopRightCornerSize(fFloatValue2).setBottomLeftCornerSize(fFloatValue3).setBottomRightCornerSize(fFloatValue4);
            }
            shapeableImageView.setShapeAppearanceModel(builder.build());
        }
    }
}
