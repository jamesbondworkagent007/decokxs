package o;

import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55250xgR implements InterfaceC52764wXm {
    public int AEQbTJ;
    public int AYXKKw;
    public final C55249xgQ AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public android.content.res.ColorStateList DbNXlk;
    public int OLrzqt;
    public int djBIcL;
    public int ejfBZ;
    public float fARcdN;
    public float fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public int getFieldNames;
    public float getNewProxyInstance;
    public android.content.res.ColorStateList hDKMBd;
    public int isConnected;
    public int iwGUEr;
    public int uzCIH;
    public android.content.res.ColorStateList valueOf;
    public int values;
    public int zsXlph;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final int EZpvd = C52761wXj.LoaderManager.finit;
    public static final int KWHzl = C52761wXj.LoaderManager.fZBcTu;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AuCTel() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(android.content.res.ColorStateList colorStateList) {
        this.DbNXlk = colorStateList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.zsXlph = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(android.content.res.ColorStateList colorStateList) {
        this.valueOf = colorStateList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList ejfBZ() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fJNWhG() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.AuCTel;
    }

    public C55250xgR(@NotNull C55249xgQ c55249xgQ) {
        Intrinsics.checkNotNullParameter(c55249xgQ, "");
        this.AhwBna = c55249xgQ;
        this.zsXlph = -1;
        this.fARcdN = 14.0f;
        this.fIwbmz = 14.0f;
        android.content.Context context = c55249xgQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.ejfBZ = C55298xhM.OLrzqt(20, context);
        this.getNewProxyInstance = 12.0f;
        android.content.Context context2 = c55249xgQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.uzCIH = C55298xhM.OLrzqt(16, context2);
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        if (this.zsXlph == -1) {
            typedArrayObtainStyledAttributes = this.AhwBna.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.nriSR, i, EZpvd);
        } else {
            typedArrayObtainStyledAttributes = new androidx.appcompat.view.ContextThemeWrapper(this.AhwBna.getContext(), C52761wXj.LoaderManager.DAIeex).obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.nriSR, i, KWHzl);
        }
        Intrinsics.copydefault(typedArrayObtainStyledAttributes);
        this.hDKMBd = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.gwwzsY);
        this.DbNXlk = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.hPlhRW);
        this.valueOf = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.onStatusChanged);
        this.values = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.onProviderDisabled, 0);
        int i3 = C52761wXj.PictureInPictureParams.HrMTQN;
        android.content.Context context = this.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.fARcdN = typedArrayObtainStyledAttributes.getDimension(i3, C55298xhM.EZpvd(14.0f, context));
        this.isConnected = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.onProviderEnabled, 0);
        this.AuCTel = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.OKSWiw, 0);
        int i4 = C52761wXj.PictureInPictureParams.adwzgZ;
        android.content.Context context2 = this.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.fIwbmz = typedArrayObtainStyledAttributes.getDimension(i4, C55298xhM.EZpvd(14.0f, context2));
        this.fJNWhG = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.DzOuPm, 0);
        this.iwGUEr = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.zlzhuY, 0);
        int i5 = C52761wXj.PictureInPictureParams.setProfilesSinceInitCount;
        android.content.Context context3 = this.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.getNewProxyInstance = typedArrayObtainStyledAttributes.getDimension(i5, C55298xhM.EZpvd(12.0f, context3));
        this.getFieldNames = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.IKQXqd, 0);
        this.gEmmrt = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.DPVBvL, ViewCompat.MEASURED_STATE_MASK);
        int i6 = C52761wXj.PictureInPictureParams.apLTlu;
        android.content.Context context4 = this.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i6, C55298xhM.OLrzqt(2, context4));
        int i7 = C52761wXj.PictureInPictureParams.DsfknC;
        android.content.Context context5 = this.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.djBIcL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i7, C55298xhM.OLrzqt(2, context5));
        int i8 = C52761wXj.PictureInPictureParams.QOeQqh;
        android.content.Context context6 = this.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        this.AYXKKw = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i8, C55298xhM.OLrzqt(2, context6));
        int i9 = C52761wXj.PictureInPictureParams.DAgZj;
        android.content.Context context7 = this.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i9, C55298xhM.OLrzqt(4, context7));
        this.AkhnZx = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.aWJMta, ViewCompat.MEASURED_STATE_MASK);
        this.OLrzqt = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.fzHEvu, -16776961);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: o.xgR$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final int EZpvd() {
            return C55250xgR.EZpvd;
        }
    }
}
