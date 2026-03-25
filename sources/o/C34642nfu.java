package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34642nfu extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final boolean OLrzqt;
    public oNZ gEmmrt;
    public Function1<? super C34640nfs, Unit> AEQbTJ = new Function1() { // from class: o.nfw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C34642nfu.AEQbTJ((C34640nfs) obj);
        }
    };
    public java.util.List<C34640nfs> EZpvd = yDY.AhwBna();
    public java.lang.String copydefault = "";
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.nft
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34642nfu.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    public static final Unit AEQbTJ(C34640nfs c34640nfs) {
        return Unit.INSTANCE;
    }

    public final C34594nez AEQbTJ() {
        return (C34594nez) this.djBIcL.getValue();
    }

    public static final C34594nez copydefault(C34642nfu c34642nfu) {
        android.content.Context contextRequireContext = c34642nfu.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C34594nez(C33054mpH.AEQbTJ(contextRequireContext));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = oNZ.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        EZpvd();
    }

    private final void EZpvd() {
        oNZ onz = this.gEmmrt;
        if (onz != null) {
            onz.AEQbTJ.removeAllViews();
            for (final C34640nfs c34640nfs : this.EZpvd) {
                final C36079oOm c36079oOmCopydefault = C36079oOm.copydefault(getCustomLayoutInflater(), onz.AEQbTJ, true);
                Intrinsics.checkNotNullExpressionValue(c36079oOmCopydefault, "");
                c36079oOmCopydefault.AEQbTJ.setText(c34640nfs.KWHzl());
                int i = 8;
                if (c34640nfs.OLrzqt() != null) {
                    android.widget.ImageView imageView = c36079oOmCopydefault.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    c36079oOmCopydefault.copydefault.setImageDrawable(c34640nfs.OLrzqt());
                } else if (c34640nfs.AEQbTJ().length() > 0) {
                    android.widget.ImageView imageView2 = c36079oOmCopydefault.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(0);
                    java.lang.Integer numCopydefault = c34640nfs.copydefault();
                    android.graphics.drawable.Drawable drawable = numCopydefault != null ? ContextCompat.getDrawable(requireContext(), numCopydefault.intValue()) : null;
                    android.widget.ImageView imageView3 = c36079oOmCopydefault.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    mUS.AEQbTJ(imageView3, c34640nfs.AEQbTJ(), new AbstractC5396Qc[]{AEQbTJ()}, drawable, new Function2() { // from class: o.nfv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C34642nfu.copydefault(c34640nfs, c36079oOmCopydefault, (android.graphics.Bitmap) obj, (java.lang.Throwable) obj2);
                        }
                    });
                } else {
                    android.widget.ImageView imageView4 = c36079oOmCopydefault.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(8);
                }
                android.widget.ImageView imageView5 = c36079oOmCopydefault.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                if (c34640nfs.EZpvd()) {
                    i = 0;
                }
                imageView5.setVisibility(i);
                c36079oOmCopydefault.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.nfx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C34642nfu.copydefault(this.EZpvd, c34640nfs, view);
                    }
                });
            }
        }
    }

    public static final Unit copydefault(C34640nfs c34640nfs, C36079oOm c36079oOm, android.graphics.Bitmap bitmap, java.lang.Throwable th) {
        boolean z = th == null || c34640nfs.copydefault() != null;
        android.widget.ImageView imageView = c36079oOm.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (th != null && c34640nfs.copydefault() != null) {
            c36079oOm.copydefault.setImageResource(c34640nfs.copydefault().intValue());
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C34642nfu c34642nfu, C34640nfs c34640nfs, android.view.View view) {
        c34642nfu.AEQbTJ.invoke(c34640nfs);
        c34642nfu.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.AEQbTJ.invoke(null);
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.nfu$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nfu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C34642nfu KWHzl(@NotNull java.util.List<C34640nfs> list, @NotNull java.lang.String str, @NotNull Function1<? super C34640nfs, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C34642nfu c34642nfu = new C34642nfu();
            c34642nfu.EZpvd = list;
            c34642nfu.copydefault = str;
            c34642nfu.AEQbTJ = function1;
            return c34642nfu;
        }
    }
}
