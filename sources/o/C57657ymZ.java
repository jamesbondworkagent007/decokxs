package o;

import android.graphics.drawable.ColorDrawable;
import android.view.WindowManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57657ymZ extends C32995moB implements mAN {
    public int AEQbTJ;
    public int AYXKKw;
    public boolean EZpvd;
    public boolean KWHzl;
    public wZH OLrzqt;
    public final C55336xhy copydefault;
    public InterfaceC31682mAP djBIcL;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57657ymZ() {
        this(null, 0, 0, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC31682mAP interfaceC31682mAP) {
        Intrinsics.checkNotNullParameter(interfaceC31682mAP, "");
        this.djBIcL = interfaceC31682mAP;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:o.xhy:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xhy:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:32) call: o.xhy.<init>():void type: CONSTRUCTOR) : (r2v0 o.xhy))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (48 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(o.xhy, int, int, int):void (m)] (LINE:31) call: o.ymZ.<init>(o.xhy, int, int, int):void type: THIS */
    public /* synthetic */ C57657ymZ(C55336xhy c55336xhy, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new C55336xhy() : c55336xhy, (i4 & 2) != 0 ? 48 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    public C57657ymZ(@NotNull C55336xhy c55336xhy, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c55336xhy, "");
        this.copydefault = c55336xhy;
        this.AEQbTJ = i;
        this.valueOf = i2;
        this.AYXKKw = i3;
        this.KWHzl = true;
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C52761wXj.LoaderManager.DarRvM);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        wZH wzhOLrzqt = wZH.OLrzqt(android.view.LayoutInflater.from(getContext()), viewGroup, false);
        this.OLrzqt = wzhOLrzqt;
        if (wzhOLrzqt == null) {
            Intrinsics.gEmmrt("");
            wzhOLrzqt = null;
        }
        C55288xhC root = wzhOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.copydefault.EZpvd(this);
        wZH wzh = this.OLrzqt;
        if (wzh == null) {
            Intrinsics.gEmmrt("");
            wzh = null;
        }
        wzh.OLrzqt.AEQbTJ(this.copydefault);
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "");
            attributes.gravity = this.AEQbTJ;
            int iOLrzqt = OLrzqt();
            window.setFlags(32, 32);
            window.setFlags(8, 8);
            window.clearFlags(2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(131072);
            window.setGravity(this.AEQbTJ);
            if (iOLrzqt == 0) {
                window.setLayout(-1, -1);
            } else {
                window.setLayout(-1, -2);
            }
            window.setAttributes(attributes);
            this.copydefault.copydefault(this.valueOf, this.AYXKKw);
        }
        if (this.copydefault.copydefault()) {
            view.postDelayed(new java.lang.Runnable() { // from class: o.ymX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57657ymZ.copydefault(this.AEQbTJ);
                }
            }, 500L);
        }
    }

    public static final void copydefault(C57657ymZ c57657ymZ) {
        android.view.Window window;
        android.view.Window window2;
        android.app.Dialog dialog = c57657ymZ.getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.clearFlags(8);
        }
        android.app.Dialog dialog2 = c57657ymZ.getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.clearFlags(32);
    }

    @Override // o.C32995moB, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.KWHzl) {
            this.KWHzl = false;
            wZH wzh = this.OLrzqt;
            if (wzh == null) {
                Intrinsics.gEmmrt("");
                wzh = null;
            }
            wzh.OLrzqt.post(new java.lang.Runnable() { // from class: o.ymW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57657ymZ.KWHzl(this.EZpvd);
                }
            });
        }
    }

    public static final void KWHzl(C57657ymZ c57657ymZ) {
        InterfaceC31682mAP interfaceC31682mAP = c57657ymZ.djBIcL;
        if (interfaceC31682mAP != null) {
            interfaceC31682mAP.EZpvd();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new android.app.Dialog(requireContext());
    }

    @Override // o.mAN
    public void AEQbTJ() {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (!this.KWHzl) {
            this.KWHzl = true;
            C57656ymY.OLrzqt.valueOf();
        }
        this.copydefault.OLrzqt(true);
        this.EZpvd = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault.OLrzqt(true);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        super.show(fragmentManager, str);
    }

    public final int OLrzqt() {
        android.view.Window window;
        android.view.View decorView;
        android.graphics.Rect rect = new android.graphics.Rect();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        return rect.height();
    }
}
