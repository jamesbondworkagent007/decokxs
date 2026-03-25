package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.rxutils.SubHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24364icT extends AbstractC24351icG {
    public Function0<Unit> AhwBna;
    public Function0<Unit> djBIcL;
    public hBA gEmmrt;
    public final java.lang.Object valueOf = new java.lang.Object();
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.icT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.icT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C24364icT OLrzqt(@NotNull java.lang.String str, @NotNull DexQuoteBridgeVO dexQuoteBridgeVO, int i, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dexQuoteBridgeVO, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            C24364icT c24364icT = new C24364icT();
            c24364icT.AhwBna = function0;
            c24364icT.djBIcL = function02;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", str);
            bundle.putParcelable("data", dexQuoteBridgeVO);
            bundle.putInt("route_height", i);
            c24364icT.setArguments(bundle);
            return c24364icT;
        }
    }

    @Override // o.AbstractC24351icG
    public void OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.gEmmrt = hBA.AEQbTJ(layoutInflater, viewGroup, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        djBIcL();
        view.post(new java.lang.Runnable() { // from class: o.ida
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24364icT.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(C24364icT c24364icT) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24364icT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void valueOf() {
        android.os.Bundle arguments;
        DexQuoteBridgeVO dexQuoteBridgeVO;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (dexQuoteBridgeVO = (DexQuoteBridgeVO) arguments2.getParcelable("data")) != null) {
            android.os.Bundle arguments3 = getArguments();
            copydefault(dexQuoteBridgeVO, arguments3 != null ? arguments3.getString("type") : null);
        }
        if (AEQbTJ() == null || (arguments = getArguments()) == null) {
            return;
        }
        AEQbTJ(java.lang.Integer.valueOf(arguments.getInt("route_height")).intValue());
    }

    private final void djBIcL() {
        wXQ wxqKWHzl = KWHzl();
        if (wxqKWHzl != null) {
            wxqKWHzl.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.icU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24364icT.AEQbTJ(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C24364icT c24364icT, android.view.View view) {
        Function0<Unit> function0 = c24364icT.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void copydefault(final DexQuoteBridgeVO dexQuoteBridgeVO, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) QuotePriceRes.FROM_POOL)) {
            wXQ wxqKWHzl = KWHzl();
            if (wxqKWHzl != null) {
                wxqKWHzl.AYXKKw().setText(dexQuoteBridgeVO.getFromPoolName());
            }
            hBA hba = this.gEmmrt;
            if (hba != null) {
                if (dexQuoteBridgeVO.getFromPoolAddress().length() == 0) {
                    hba.EZpvd.setImageResource(C52761wXj.TaskDescription.dNxZaP);
                    hba.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe)));
                } else {
                    hba.EZpvd.setImageResource(C52761wXj.TaskDescription.dNxZaP);
                    hba.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab)));
                }
                hba.EZpvd.setVisibility(dexQuoteBridgeVO.getFromPoolAddress().length() != 0 ? 0 : 8);
                AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(hba.OLrzqt).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
                InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.icV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C24364icT.AEQbTJ(dexQuoteBridgeVO, this, obj);
                    }
                };
                final Function1 function1 = new Function1() { // from class: o.icS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C24364icT.OLrzqt((java.lang.Throwable) obj);
                    }
                };
                InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgThrottleFirst.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.icW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C24364icT.AEQbTJ(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
                C33050mpD.EZpvd(interfaceC58217yxCSubscribe, this.valueOf);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) QuotePriceRes.TO_POOL)) {
            wXQ wxqKWHzl2 = KWHzl();
            if (wxqKWHzl2 != null) {
                wxqKWHzl2.AYXKKw().setText(dexQuoteBridgeVO.getToPoolName());
            }
            hBA hba2 = this.gEmmrt;
            if (hba2 != null) {
                if (dexQuoteBridgeVO.getFromPoolAddress().length() == 0) {
                    hba2.EZpvd.setImageResource(C52761wXj.TaskDescription.dNxZaP);
                    hba2.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe)));
                } else {
                    hba2.EZpvd.setImageResource(C52761wXj.TaskDescription.dNxZaP);
                    hba2.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab)));
                }
                hba2.EZpvd.setVisibility(dexQuoteBridgeVO.getToPoolAddress().length() != 0 ? 0 : 8);
                AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(hba2.OLrzqt).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
                InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.icZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C24364icT.copydefault(dexQuoteBridgeVO, this, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.idb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C24364icT.KWHzl((java.lang.Throwable) obj);
                    }
                };
                InterfaceC58217yxC interfaceC58217yxCSubscribe2 = abstractC58247yxgThrottleFirst2.subscribe(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.icX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C24364icT.OLrzqt(function12, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe2, "");
                C33050mpD.EZpvd(interfaceC58217yxCSubscribe2, this.valueOf);
            }
        }
        hBA hba3 = this.gEmmrt;
        if (hba3 != null) {
            hba3.copydefault.setText(dexQuoteBridgeVO.getBridgeName());
            hba3.KWHzl.setText(C23311hvo.formatPercent$default(dexQuoteBridgeVO.getPercent(), false, 0, 0, null, null, 30, null));
        }
    }

    public static final void AEQbTJ(DexQuoteBridgeVO dexQuoteBridgeVO, C24364icT c24364icT, java.lang.Object obj) {
        if (dexQuoteBridgeVO.getFromPoolAddress().length() > 0) {
            c24364icT.AEQbTJ(dexQuoteBridgeVO.getFromPoolAddress());
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(DexQuoteBridgeVO dexQuoteBridgeVO, C24364icT c24364icT, java.lang.Object obj) {
        if (dexQuoteBridgeVO.getToPoolAddress().length() > 0) {
            c24364icT.AEQbTJ(dexQuoteBridgeVO.getToPoolAddress());
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(int i) {
        android.widget.LinearLayout linearLayout;
        C23499hzQ c23499hzQAEQbTJ = AEQbTJ();
        if (c23499hzQAEQbTJ == null || (linearLayout = c23499hzQAEQbTJ.AEQbTJ) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    private final void AEQbTJ(java.lang.String str) {
        C25352ivB.KWHzl(getContext(), str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.valueOf);
        SubHelper.AEQbTJ(this);
    }
}
