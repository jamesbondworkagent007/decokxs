package o;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55257xgY implements InterfaceC52764wXm {
    public boolean AYXKKw;
    public final android.content.res.ColorStateList[] AhwBna;
    public final android.util.SparseIntArray AkhnZx;
    public final C55251xgS AuCTel;
    public float DbNXlk;
    public final android.content.Context EZpvd;
    public final android.content.res.ColorStateList[] KWHzl;
    public final android.content.res.ColorStateList[] OLrzqt;
    public final float copydefault;
    public final android.util.SparseIntArray djBIcL;
    public int fARcdN;
    public int fIwbmz;
    public final C52766wXo fJNWhG;
    public float fetchVPNInfo;
    public final android.content.res.ColorStateList[] gEmmrt;
    public boolean isConnected;
    public final android.util.SparseIntArray valueOf;
    public final android.util.SparseIntArray values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList[] AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList[] EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList[] OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList[] copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float valueOf() {
        return this.DbNXlk;
    }

    public C55257xgY(@NotNull C55251xgS c55251xgS) {
        Intrinsics.checkNotNullParameter(c55251xgS, "");
        this.AuCTel = c55251xgS;
        android.content.Context context = c55251xgS.getContext();
        this.EZpvd = context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.copydefault = C55298xhM.gEmmrt(14.0f, context);
        this.OLrzqt = new android.content.res.ColorStateList[17];
        this.KWHzl = new android.content.res.ColorStateList[17];
        this.gEmmrt = new android.content.res.ColorStateList[17];
        this.AhwBna = new android.content.res.ColorStateList[17];
        this.values = new android.util.SparseIntArray(4);
        this.AkhnZx = new android.util.SparseIntArray(4);
        this.djBIcL = new android.util.SparseIntArray(4);
        this.valueOf = new android.util.SparseIntArray(4);
        this.fJNWhG = new C52766wXo(c55251xgS);
    }

    /* JADX INFO: renamed from: o.xgY$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(boolean z) {
        if (this.AYXKKw != z) {
            djBIcL();
        }
        this.AYXKKw = z;
    }

    public final void djBIcL() {
        android.content.res.ColorStateList[] colorStateListArr = this.OLrzqt;
        android.content.res.ColorStateList colorStateList = colorStateListArr[14];
        colorStateListArr[14] = colorStateListArr[13];
        Unit unit = Unit.INSTANCE;
        colorStateListArr[13] = colorStateList;
        android.content.res.ColorStateList[] colorStateListArr2 = this.KWHzl;
        android.content.res.ColorStateList colorStateList2 = colorStateListArr2[14];
        colorStateListArr2[14] = colorStateListArr2[13];
        colorStateListArr2[13] = colorStateList2;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        this.fJNWhG.OLrzqt(attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.EZpvd.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.SePrCP, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.values.put(-3, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.dPaqAf, 0));
        this.AkhnZx.put(-3, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.fACtfg, 0));
        this.djBIcL.put(-3, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ahrCSq, 0));
        android.util.SparseIntArray sparseIntArray = this.valueOf;
        android.content.Context context = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(context, "");
        sparseIntArray.put(-3, C55298xhM.OLrzqt(24, context));
        this.values.put(-4, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.iTrKTi, 0));
        this.AkhnZx.put(-4, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ikEgkI, 0));
        this.djBIcL.put(-4, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.iSpHlg, 0));
        android.util.SparseIntArray sparseIntArray2 = this.valueOf;
        android.content.Context context2 = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(context2, "");
        sparseIntArray2.put(-4, C55298xhM.OLrzqt(20, context2));
        this.values.put(-5, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.aLnfMH, 0));
        this.AkhnZx.put(-5, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.RxVVQC, 0));
        this.djBIcL.put(-5, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.UUsvzUhTFPAC, 0));
        android.util.SparseIntArray sparseIntArray3 = this.valueOf;
        android.content.Context context3 = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(context3, "");
        sparseIntArray3.put(-5, C55298xhM.OLrzqt(16, context3));
        this.values.put(-6, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.svUkWZ, 0));
        this.AkhnZx.put(-6, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.gxJrGF, 0));
        this.djBIcL.put(-6, typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.zCTncp, 0));
        this.OLrzqt[0] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.iluEmO);
        this.KWHzl[0] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.hErYDe);
        this.gEmmrt[0] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.sanitizeSessionIdIgnoreCase);
        this.AhwBna[0] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.validateSHA256);
        this.OLrzqt[1] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.RZOtbZ);
        this.KWHzl[1] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DdI);
        this.gEmmrt[1] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.ibrGus);
        this.AhwBna[1] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.SqfPTR);
        this.OLrzqt[2] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.RgaQzq);
        this.KWHzl[2] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.QWSkGZ);
        this.gEmmrt[2] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.aSdHwS);
        this.AhwBna[2] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.RAaltf);
        this.OLrzqt[3] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.rsEnD);
        this.KWHzl[3] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.zUtmHU);
        this.gEmmrt[3] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DLl);
        this.AhwBna[3] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.UUsvzU);
        this.OLrzqt[4] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DRtzUu);
        this.KWHzl[4] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DRuYWY);
        this.gEmmrt[4] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.OTJFaA);
        this.AhwBna[4] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.OsDdEf);
        this.OLrzqt[5] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.UimiPOhkCVbT);
        this.KWHzl[5] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.gISBfG);
        this.gEmmrt[5] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.iflRwn);
        this.AhwBna[5] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DKr);
        this.OLrzqt[6] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.Slwtri);
        this.KWHzl[6] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.zMXLsR);
        this.OLrzqt[15] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.UPbYzn);
        this.KWHzl[15] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.Srftgn);
        this.OLrzqt[16] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DDxOgT);
        this.KWHzl[16] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DHEdFZ);
        this.OLrzqt[7] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.QfgJNx);
        this.KWHzl[7] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DvMhtu);
        this.OLrzqt[8] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.aRClCA);
        this.KWHzl[8] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.QgUVrU);
        this.OLrzqt[9] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.onServiceConnected);
        this.KWHzl[9] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.onServiceDisconnected);
        this.OLrzqt[10] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.OqIZjC);
        this.KWHzl[10] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.QUeTTI);
        this.OLrzqt[11] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.QqiRNA);
        this.KWHzl[11] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.UimiPO);
        this.OLrzqt[12] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.RXxsjQ);
        this.KWHzl[12] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DYICSh);
        this.OLrzqt[13] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.dTTfOR);
        this.KWHzl[13] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.ddhgMB);
        this.OLrzqt[14] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.fObYrO);
        this.KWHzl[14] = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.getUriFromString);
        if (this.AYXKKw) {
            djBIcL();
        }
        this.DbNXlk = typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.zeUJxr, 4.0f);
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.validateAndPutInMap, 14.0f);
        int i3 = C52761wXj.PictureInPictureParams.aVPvww;
        android.content.Context context4 = this.AuCTel.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.fARcdN = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, C55298xhM.KWHzl(1.0f, context4));
        this.isConnected = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.dGgpab, false);
        this.fIwbmz = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.doTurnConnection, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float EZpvd(int i) {
        return this.fJNWhG.copydefault(i, this.copydefault);
    }

    public final int OLrzqt(int i) {
        return this.values.get(i, 0);
    }

    public final int copydefault(int i) {
        return this.AkhnZx.get(i, 0);
    }

    public final int KWHzl(int i) {
        return this.djBIcL.get(i, 0);
    }

    public final int AEQbTJ(int i) {
        return this.valueOf.get(i, 0);
    }
}
