package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;

/* JADX INFO: renamed from: o.wYe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52783wYe implements InterfaceC52764wXm {
    public android.graphics.drawable.Drawable AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public wXQ DbNXlk;
    public int EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public android.content.res.ColorStateList OLrzqt;
    public android.content.res.ColorStateList copydefault;
    public int djBIcL;
    public float fARcdN;
    public int fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public final C52781wYc valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52783wYe() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float isConnected() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.djBIcL;
    }

    public C52783wYe(C52781wYc c52781wYc, wXQ wxq) {
        this.valueOf = c52781wYc;
        this.DbNXlk = wxq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.wYc:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.wYc) : (r2v0 o.wYc))
  (wrap:o.wXQ:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.wXQ) : (r3v0 o.wXQ))
 A[MD:(o.wYc, o.wXQ):void (m)] (LINE:18) call: o.wYe.<init>(o.wYc, o.wXQ):void type: THIS */
    public /* synthetic */ C52783wYe(C52781wYc c52781wYc, wXQ wxq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c52781wYc, (i & 2) != 0 ? null : wxq);
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        android.content.Context context;
        C52781wYc c52781wYc = this.valueOf;
        if (c52781wYc == null || (context = c52781wYc.getContext()) == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fjfviF, i, i2)) == null) {
            wXQ wxq = this.DbNXlk;
            Intrinsics.copydefault(wxq);
            typedArrayObtainStyledAttributes = wxq.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fjfviF, i, i2);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        }
        this.djBIcL = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.call, 0);
        this.KWHzl = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.Dmq);
        this.OLrzqt = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.zblBkD);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.DCUTEIdCUTEI);
        this.copydefault = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DGOPHZ);
        this.values = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.DcqEDu, 0);
        this.AkhnZx = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.heceqZ, 0);
        this.fARcdN = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.spnCvw, 0.0f);
        this.AhwBna = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.fHqPtx, 0);
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.DWgRXt, 0);
        this.isConnected = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.KDccX, 0);
        this.EZpvd = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.DCUTEIddSDPG, 0);
        this.AYXKKw = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.run, 0);
        this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.WS, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
