package o;

import com.okinc.uilab.item.OKRegularCell;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55069xcw implements InterfaceC52764wXm {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public final OKRegularCell AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public android.content.res.ColorStateList EZpvd;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public int fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public android.content.res.ColorStateList isConnected;
    public int valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AhwBna;
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
    public final int isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.fJNWhG;
    }

    public C55069xcw(@NotNull OKRegularCell oKRegularCell) {
        Intrinsics.checkNotNullParameter(oKRegularCell, "");
        this.AkhnZx = oKRegularCell;
        this.fJNWhG = 2;
        this.copydefault = 3;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.AkhnZx.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.GqbzPL, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.isConnected = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.HJWChPHhYHK);
        this.fJNWhG = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.dXcUrg, 2);
        this.EZpvd = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.GiPPlLgiPPlL);
        this.copydefault = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.Dff, 3);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.fZc, 0);
        this.AuCTel = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.DeEinT, 0);
        this.values = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.hcetpZ, 0);
        this.AhwBna = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.HJWChP, 0);
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.gdLjtZ, 0);
        this.DbNXlk = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.iLWfRf, 0);
        this.djBIcL = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.GzAsTt, 0);
        this.AYXKKw = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.aappFQ, 0);
        this.valueOf = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.HJWChPDXdlte, 0);
        this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.RhjxDW, 0);
        this.OLrzqt = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.onReceive, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: o.xcw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
