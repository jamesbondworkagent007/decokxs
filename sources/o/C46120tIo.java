package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46104tHz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46120tIo {
    public static final C46120tIo copydefault = new C46120tIo();

    private C46120tIo() {
    }

    public final C46471tVo OLrzqt(@NotNull C46471tVo c46471tVo, @NotNull InterfaceC46104tHz interfaceC46104tHz) {
        Intrinsics.checkNotNullParameter(c46471tVo, "");
        Intrinsics.checkNotNullParameter(interfaceC46104tHz, "");
        return copydefault(c46471tVo, interfaceC46104tHz);
    }

    public final C46471tVo copydefault(C46471tVo c46471tVo, final InterfaceC46104tHz interfaceC46104tHz) {
        java.lang.Integer numKWHzl;
        java.lang.Integer numOLrzqt;
        java.lang.Integer numCopydefault;
        java.lang.String strEZpvd;
        if (!interfaceC46104tHz.KWHzl()) {
            float dp = interfaceC46104tHz.AEQbTJ().getDp();
            android.content.Context context = c46471tVo.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c46471tVo.EZpvd(C55298xhM.copydefault(dp, context));
        }
        c46471tVo.setInBottomSheet(interfaceC46104tHz.gEmmrt());
        c46471tVo.setSmallTitleSize(interfaceC46104tHz.copydefault());
        ViewGroup.LayoutParams layoutParams = c46471tVo.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = interfaceC46104tHz.KWHzl() ? -1 : -2;
            c46471tVo.setLayoutParams(layoutParams);
            if (interfaceC46104tHz.OLrzqt() > 0.0f) {
                ViewGroup.LayoutParams layoutParams2 = c46471tVo.getLayoutParams();
                if (layoutParams2 != null) {
                    float fOLrzqt = interfaceC46104tHz.OLrzqt();
                    android.content.Context context2 = c46471tVo.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    layoutParams2.height = C55298xhM.copydefault(fOLrzqt, context2);
                    c46471tVo.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            if (interfaceC46104tHz instanceof InterfaceC46104tHz.TaskDescription) {
                C46471tVo.setNetworkError$default(c46471tVo, 0, 0, 0, 0, new Function0() { // from class: o.tIw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46120tIo.KWHzl(interfaceC46104tHz);
                    }
                }, 15, null);
                c46471tVo.setSubtitle(((InterfaceC46104tHz.TaskDescription) interfaceC46104tHz).AYXKKw());
            } else {
                c46471tVo.setSubtitle(interfaceC46104tHz.AYXKKw());
                c46471tVo.setTitle(interfaceC46104tHz.djBIcL());
                C52794wYp c52794wYpOLrzqt = c46471tVo.OLrzqt();
                boolean z = interfaceC46104tHz.EZpvd() != null;
                C46095tHq c46095tHqEZpvd = interfaceC46104tHz.EZpvd();
                if (c46095tHqEZpvd != null && (strEZpvd = c46095tHqEZpvd.EZpvd()) != null) {
                    c52794wYpOLrzqt.setText(strEZpvd);
                }
                C46095tHq c46095tHqEZpvd2 = interfaceC46104tHz.EZpvd();
                if (c46095tHqEZpvd2 != null && (numCopydefault = c46095tHqEZpvd2.copydefault()) != null) {
                    c52794wYpOLrzqt.setOKDSType(numCopydefault.intValue());
                }
                C46095tHq c46095tHqEZpvd3 = interfaceC46104tHz.EZpvd();
                if (c46095tHqEZpvd3 != null && (numOLrzqt = c46095tHqEZpvd3.OLrzqt()) != null) {
                    c52794wYpOLrzqt.setOKDSSize(numOLrzqt.intValue());
                }
                C46095tHq c46095tHqEZpvd4 = interfaceC46104tHz.EZpvd();
                if (c46095tHqEZpvd4 != null && (numKWHzl = c46095tHqEZpvd4.KWHzl()) != null) {
                    c52794wYpOLrzqt.setOKDSPill(numKWHzl.intValue());
                }
                C46095tHq c46095tHqEZpvd5 = interfaceC46104tHz.EZpvd();
                c52794wYpOLrzqt.setEnabled(c46095tHqEZpvd5 != null ? c46095tHqEZpvd5.AYXKKw() : true);
                c52794wYpOLrzqt.setVisibility(z ? 0 : 8);
                if (!z) {
                    c52794wYpOLrzqt.setOnClickListener(null);
                } else {
                    c52794wYpOLrzqt.setOnClickListener(new StateListAnimator(c52794wYpOLrzqt, 300L, c52794wYpOLrzqt, interfaceC46104tHz));
                }
                if (interfaceC46104tHz instanceof InterfaceC46104tHz.StateListAnimator) {
                    c46471tVo.setImage(((InterfaceC46104tHz.StateListAnimator) interfaceC46104tHz).AhwBna());
                } else if (interfaceC46104tHz instanceof InterfaceC46104tHz.Application) {
                    c46471tVo.setImage(((InterfaceC46104tHz.Application) interfaceC46104tHz).valueOf());
                } else if (interfaceC46104tHz instanceof InterfaceC46104tHz.ActionBar) {
                    c46471tVo.setImage(((InterfaceC46104tHz.ActionBar) interfaceC46104tHz).AhwBna());
                }
            }
            return c46471tVo;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final Unit KWHzl(InterfaceC46104tHz interfaceC46104tHz) {
        ((InterfaceC46104tHz.TaskDescription) interfaceC46104tHz).EZpvd().AEQbTJ().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tIo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ InterfaceC46104tHz EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.view.View view2, InterfaceC46104tHz interfaceC46104tHz) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = view2;
            this.EZpvd = interfaceC46104tHz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0<Unit> function0AEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C46095tHq c46095tHqEZpvd = this.EZpvd.EZpvd();
                if (c46095tHqEZpvd == null || (function0AEQbTJ = c46095tHqEZpvd.AEQbTJ()) == null) {
                    return;
                }
                function0AEQbTJ.invoke();
            }
        }
    }
}
