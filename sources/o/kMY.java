package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kMY extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C21499hBq AhwBna;
    public final boolean OLrzqt;
    public Function1<? super kMS, Unit> AEQbTJ = new Function1() { // from class: o.kNb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kMY.EZpvd((kMS) obj);
        }
    };
    public java.util.List<kMS> KWHzl = yDY.AhwBna();
    public java.lang.String copydefault = "";
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.kNe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kMY.OLrzqt(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    public static final Unit EZpvd(kMS kms) {
        return Unit.INSTANCE;
    }

    public final kLS copydefault() {
        return (kLS) this.gEmmrt.getValue();
    }

    public static final kLS OLrzqt(kMY kmy) {
        android.content.Context contextRequireContext = kmy.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new kLS(C33054mpH.AEQbTJ(contextRequireContext));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt();
    }

    private final void OLrzqt() {
        C32866mlf.onEvent$default("DEXMarket_Token_History_Labels_View", (TrackChannel[]) null, new Function1() { // from class: o.kMX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kMY.EZpvd(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(kMY kmy, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", kmy.copydefault, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AhwBna = C21499hBq.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        KWHzl();
    }

    private final void KWHzl() {
        C21499hBq c21499hBq = this.AhwBna;
        if (c21499hBq != null) {
            c21499hBq.EZpvd.removeAllViews();
            for (final kMS kms : this.KWHzl) {
                final C21537hDa c21537hDaCopydefault = C21537hDa.copydefault(getCustomLayoutInflater(), c21499hBq.EZpvd, true);
                Intrinsics.checkNotNullExpressionValue(c21537hDaCopydefault, "");
                c21537hDaCopydefault.copydefault.setText(kms.EZpvd());
                int i = 8;
                if (kms.copydefault() != null) {
                    android.widget.ImageView imageView = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    c21537hDaCopydefault.KWHzl.setImageDrawable(kms.copydefault());
                } else if (kms.AEQbTJ().length() > 0) {
                    android.widget.ImageView imageView2 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(0);
                    java.lang.Integer numOLrzqt = kms.OLrzqt();
                    android.graphics.drawable.Drawable drawable = numOLrzqt != null ? ContextCompat.getDrawable(requireContext(), numOLrzqt.intValue()) : null;
                    android.widget.ImageView imageView3 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    C25392ivp.AEQbTJ(imageView3, kms.AEQbTJ(), new AbstractC5396Qc[]{copydefault()}, drawable, (Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, Unit>) new Function2() { // from class: o.kMZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return kMY.AEQbTJ(kms, c21537hDaCopydefault, (android.graphics.Bitmap) obj, (java.lang.Throwable) obj2);
                        }
                    });
                } else {
                    android.widget.ImageView imageView4 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(8);
                }
                android.widget.ImageView imageView5 = c21537hDaCopydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                if (kms.KWHzl()) {
                    i = 0;
                }
                imageView5.setVisibility(i);
                c21537hDaCopydefault.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.kNa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        kMY.AEQbTJ(this.AEQbTJ, kms, view);
                    }
                });
            }
        }
    }

    public static final Unit AEQbTJ(kMS kms, C21537hDa c21537hDa, android.graphics.Bitmap bitmap, java.lang.Throwable th) {
        boolean z = th == null || kms.OLrzqt() != null;
        android.widget.ImageView imageView = c21537hDa.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (th != null && kms.OLrzqt() != null) {
            c21537hDa.KWHzl.setImageResource(kms.OLrzqt().intValue());
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(kMY kmy, kMS kms, android.view.View view) {
        kmy.AEQbTJ.invoke(kms);
        kmy.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.AEQbTJ.invoke(null);
        super.onDismiss(dialogInterface);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kMY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final kMY OLrzqt(@NotNull java.util.List<kMS> list, @NotNull java.lang.String str, @NotNull Function1<? super kMS, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            kMY kmy = new kMY();
            kmy.KWHzl = list;
            kmy.copydefault = str;
            kmy.AEQbTJ = function1;
            return kmy;
        }
    }
}
