package o;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10324bmM extends AppCompatImageView {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public int KWHzl;
    public InterfaceC10330bmS OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10324bmM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10324bmM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoSetState(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCheckStateChangeListener(@NotNull InterfaceC10330bmS interfaceC10330bmS) {
        Intrinsics.checkNotNullParameter(interfaceC10330bmS, "");
        this.OLrzqt = interfaceC10330bmS;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.bmM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C10324bmM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10324bmM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
        setCheckState(0);
        C8003auW.copydefault(this).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10324bmM.KWHzl(this.AEQbTJ, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.bmM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bmM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final void KWHzl(C10324bmM c10324bmM, java.lang.Object obj) {
        int i = c10324bmM.KWHzl;
        if (i == 0) {
            if (c10324bmM.AEQbTJ) {
                c10324bmM.setCheckState(1, true);
                return;
            }
            InterfaceC10330bmS interfaceC10330bmS = c10324bmM.OLrzqt;
            if (interfaceC10330bmS != null) {
                interfaceC10330bmS.KWHzl(c10324bmM, 1);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        if (c10324bmM.AEQbTJ) {
            c10324bmM.setCheckState(0, true);
            return;
        }
        InterfaceC10330bmS interfaceC10330bmS2 = c10324bmM.OLrzqt;
        if (interfaceC10330bmS2 != null) {
            interfaceC10330bmS2.KWHzl(c10324bmM, 0);
        }
    }

    public final void setCheckState(int i) {
        setCheckState(i, false);
    }

    public static /* synthetic */ void setCheckState$default(C10324bmM c10324bmM, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c10324bmM.setCheckState(i, z);
    }

    public final void setCheckState(int i, boolean z) {
        InterfaceC10330bmS interfaceC10330bmS;
        this.KWHzl = i;
        if (i == 0) {
            int i2 = C52761wXj.TaskDescription.sEAkxl;
            setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            setImageResource(i2);
        } else if (i == 1) {
            int i3 = C52761wXj.TaskDescription.DjwCMv;
            setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            setImageResource(i3);
        } else if (i == 2) {
            int i4 = C52761wXj.TaskDescription.DjwCMv;
            setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.QwvEab));
            setImageResource(i4);
        } else {
            int i5 = C52761wXj.TaskDescription.fzHEvu;
            setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            setImageResource(i5);
        }
        if (!z || (interfaceC10330bmS = this.OLrzqt) == null) {
            return;
        }
        interfaceC10330bmS.KWHzl(this, i);
    }
}
