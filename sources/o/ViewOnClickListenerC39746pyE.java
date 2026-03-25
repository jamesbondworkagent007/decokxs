package o;

import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C39804pzJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC39746pyE extends android.widget.FrameLayout implements View.OnClickListener, InterfaceC35967oKi {
    public C39804pzJ AEQbTJ;
    public android.widget.ImageView AYXKKw;
    public android.widget.ImageView AhwBna;
    public C39804pzJ AkhnZx;
    public android.widget.RelativeLayout AuCTel;
    public Function1<? super java.lang.Boolean, Unit> DbNXlk;
    public android.widget.ImageView EZpvd;
    public android.widget.ImageView KWHzl;
    public android.widget.ImageView OLrzqt;
    public C39804pzJ copydefault;
    public android.widget.ImageView djBIcL;
    public android.widget.RelativeLayout ejfBZ;
    public android.widget.RelativeLayout fARcdN;
    public android.widget.RelativeLayout fIwbmz;
    public android.widget.RelativeLayout fJNWhG;
    public android.widget.ImageView fetchVPNInfo;
    public android.widget.ImageView gEmmrt;
    public android.widget.RelativeLayout getFieldNames;
    public android.widget.RelativeLayout getNewProxyInstance;
    public android.widget.RelativeLayout hDKMBd;
    public Function1<? super java.lang.Integer, Unit> isConnected;
    public android.widget.RelativeLayout iwGUEr;
    public android.widget.ImageView valueOf;
    public Function1<? super java.lang.Integer, Unit> values;

    @Override // o.InterfaceC35967oKi
    public android.view.View KWHzl() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35967oKi
    public void setOnItemClickListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.isConnected = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35967oKi
    public void setOnItemClickTypeListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.values = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35967oKi
    public void setOnLineHideListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.DbNXlk = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39746pyE(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.RzdrRQ, this);
        this.AuCTel = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.hBORwR);
        this.hDKMBd = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.sQOHWT);
        this.iwGUEr = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.SePrCP);
        this.fARcdN = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.DtA);
        this.getNewProxyInstance = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.ScLVFT);
        this.fIwbmz = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.haRtnV);
        this.getFieldNames = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.RZOtbZ);
        this.fJNWhG = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.hCiIDQ);
        this.ejfBZ = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.zagaMW);
        this.AhwBna = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.kcQGz);
        this.valueOf = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QYvkLl);
        this.gEmmrt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.UkCIYP);
        this.AYXKKw = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QezThh);
        this.fetchVPNInfo = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.fWSAZA);
        this.KWHzl = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.hdBMmm);
        this.djBIcL = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVMIlxQVMIlx);
        this.OLrzqt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVMIlx);
        this.EZpvd = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.ruDxL);
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setSelected(C36246oUr.copydefault().QwvEab());
        }
        C39804pzJ.StateListAnimator stateListAnimator = C39804pzJ.Companion;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C39804pzJ c39804pzJOLrzqt = stateListAnimator.OLrzqt(100, context2);
        this.copydefault = c39804pzJOLrzqt;
        if (c39804pzJOLrzqt != null) {
            c39804pzJOLrzqt.EZpvd(new Function1() { // from class: o.pyK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        C39804pzJ c39804pzJOLrzqt2 = stateListAnimator.OLrzqt(101, context3);
        this.AkhnZx = c39804pzJOLrzqt2;
        if (c39804pzJOLrzqt2 != null) {
            c39804pzJOLrzqt2.EZpvd(new Function1() { // from class: o.pyI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        C39804pzJ c39804pzJOLrzqt3 = stateListAnimator.OLrzqt(200, context4);
        this.AEQbTJ = c39804pzJOLrzqt3;
        if (c39804pzJOLrzqt3 != null) {
            c39804pzJOLrzqt3.EZpvd(new Function1() { // from class: o.pyH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.AYXKKw(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.widget.RelativeLayout relativeLayout = this.AuCTel;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout2 = this.hDKMBd;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout3 = this.iwGUEr;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout4 = this.fARcdN;
        if (relativeLayout4 != null) {
            relativeLayout4.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout5 = this.getNewProxyInstance;
        if (relativeLayout5 != null) {
            relativeLayout5.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout6 = this.fIwbmz;
        if (relativeLayout6 != null) {
            relativeLayout6.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout7 = this.fJNWhG;
        if (relativeLayout7 != null) {
            relativeLayout7.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout8 = this.ejfBZ;
        if (relativeLayout8 != null) {
            relativeLayout8.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout9 = this.getFieldNames;
        if (relativeLayout9 != null) {
            C8003auW.copydefault(relativeLayout9).throttleFirst(2L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.pyJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ViewOnClickListenerC39746pyE.KWHzl(this.KWHzl, obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39746pyE(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.RzdrRQ, this);
        this.AuCTel = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.hBORwR);
        this.hDKMBd = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.sQOHWT);
        this.iwGUEr = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.SePrCP);
        this.fARcdN = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.DtA);
        this.getNewProxyInstance = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.ScLVFT);
        this.fIwbmz = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.haRtnV);
        this.getFieldNames = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.RZOtbZ);
        this.fJNWhG = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.hCiIDQ);
        this.ejfBZ = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.zagaMW);
        this.AhwBna = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.kcQGz);
        this.valueOf = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QYvkLl);
        this.gEmmrt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.UkCIYP);
        this.AYXKKw = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QezThh);
        this.fetchVPNInfo = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.fWSAZA);
        this.KWHzl = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.hdBMmm);
        this.djBIcL = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVMIlxQVMIlx);
        this.OLrzqt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVMIlx);
        this.EZpvd = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.ruDxL);
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setSelected(C36246oUr.copydefault().QwvEab());
        }
        C39804pzJ.StateListAnimator stateListAnimator = C39804pzJ.Companion;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C39804pzJ c39804pzJOLrzqt = stateListAnimator.OLrzqt(100, context2);
        this.copydefault = c39804pzJOLrzqt;
        if (c39804pzJOLrzqt != null) {
            c39804pzJOLrzqt.EZpvd(new Function1() { // from class: o.pyK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        C39804pzJ c39804pzJOLrzqt2 = stateListAnimator.OLrzqt(101, context3);
        this.AkhnZx = c39804pzJOLrzqt2;
        if (c39804pzJOLrzqt2 != null) {
            c39804pzJOLrzqt2.EZpvd(new Function1() { // from class: o.pyI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        C39804pzJ c39804pzJOLrzqt3 = stateListAnimator.OLrzqt(200, context4);
        this.AEQbTJ = c39804pzJOLrzqt3;
        if (c39804pzJOLrzqt3 != null) {
            c39804pzJOLrzqt3.EZpvd(new Function1() { // from class: o.pyH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.AYXKKw(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.widget.RelativeLayout relativeLayout = this.AuCTel;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout2 = this.hDKMBd;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout3 = this.iwGUEr;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout4 = this.fARcdN;
        if (relativeLayout4 != null) {
            relativeLayout4.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout5 = this.getNewProxyInstance;
        if (relativeLayout5 != null) {
            relativeLayout5.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout6 = this.fIwbmz;
        if (relativeLayout6 != null) {
            relativeLayout6.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout7 = this.fJNWhG;
        if (relativeLayout7 != null) {
            relativeLayout7.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout8 = this.ejfBZ;
        if (relativeLayout8 != null) {
            relativeLayout8.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout9 = this.getFieldNames;
        if (relativeLayout9 != null) {
            C8003auW.copydefault(relativeLayout9).throttleFirst(2L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.pyJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ViewOnClickListenerC39746pyE.KWHzl(this.KWHzl, obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39746pyE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.RzdrRQ, this);
        this.AuCTel = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.hBORwR);
        this.hDKMBd = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.sQOHWT);
        this.iwGUEr = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.SePrCP);
        this.fARcdN = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.DtA);
        this.getNewProxyInstance = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.ScLVFT);
        this.fIwbmz = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.haRtnV);
        this.getFieldNames = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.RZOtbZ);
        this.fJNWhG = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.hCiIDQ);
        this.ejfBZ = (android.widget.RelativeLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.zagaMW);
        this.AhwBna = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.kcQGz);
        this.valueOf = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QYvkLl);
        this.gEmmrt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.UkCIYP);
        this.AYXKKw = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QezThh);
        this.fetchVPNInfo = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.fWSAZA);
        this.KWHzl = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.hdBMmm);
        this.djBIcL = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVMIlxQVMIlx);
        this.OLrzqt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVMIlx);
        this.EZpvd = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.ruDxL);
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setSelected(C36246oUr.copydefault().QwvEab());
        }
        C39804pzJ.StateListAnimator stateListAnimator = C39804pzJ.Companion;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C39804pzJ c39804pzJOLrzqt = stateListAnimator.OLrzqt(100, context2);
        this.copydefault = c39804pzJOLrzqt;
        if (c39804pzJOLrzqt != null) {
            c39804pzJOLrzqt.EZpvd(new Function1() { // from class: o.pyK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        C39804pzJ c39804pzJOLrzqt2 = stateListAnimator.OLrzqt(101, context3);
        this.AkhnZx = c39804pzJOLrzqt2;
        if (c39804pzJOLrzqt2 != null) {
            c39804pzJOLrzqt2.EZpvd(new Function1() { // from class: o.pyI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        C39804pzJ c39804pzJOLrzqt3 = stateListAnimator.OLrzqt(200, context4);
        this.AEQbTJ = c39804pzJOLrzqt3;
        if (c39804pzJOLrzqt3 != null) {
            c39804pzJOLrzqt3.EZpvd(new Function1() { // from class: o.pyH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39746pyE.AYXKKw(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.widget.RelativeLayout relativeLayout = this.AuCTel;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout2 = this.hDKMBd;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout3 = this.iwGUEr;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout4 = this.fARcdN;
        if (relativeLayout4 != null) {
            relativeLayout4.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout5 = this.getNewProxyInstance;
        if (relativeLayout5 != null) {
            relativeLayout5.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout6 = this.fIwbmz;
        if (relativeLayout6 != null) {
            relativeLayout6.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout7 = this.fJNWhG;
        if (relativeLayout7 != null) {
            relativeLayout7.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout8 = this.ejfBZ;
        if (relativeLayout8 != null) {
            relativeLayout8.setOnClickListener(this);
        }
        android.widget.RelativeLayout relativeLayout9 = this.getFieldNames;
        if (relativeLayout9 != null) {
            C8003auW.copydefault(relativeLayout9).throttleFirst(2L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.pyJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ViewOnClickListenerC39746pyE.KWHzl(this.KWHzl, obj);
                }
            });
        }
    }

    public static final Unit EZpvd(ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = viewOnClickListenerC39746pyE.isConnected;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        Function1<? super java.lang.Integer, Unit> function12 = viewOnClickListenerC39746pyE.values;
        if (function12 != null) {
            function12.invoke(java.lang.Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = viewOnClickListenerC39746pyE.isConnected;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        Function1<? super java.lang.Integer, Unit> function12 = viewOnClickListenerC39746pyE.values;
        if (function12 != null) {
            function12.invoke(java.lang.Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = viewOnClickListenerC39746pyE.isConnected;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        Function1<? super java.lang.Integer, Unit> function12 = viewOnClickListenerC39746pyE.values;
        if (function12 != null) {
            function12.invoke(java.lang.Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE, java.lang.Object obj) {
        Function1<? super java.lang.Integer, Unit> function1 = viewOnClickListenerC39746pyE.isConnected;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(C35964oKf.StateListAnimator.RZOtbZ));
        }
        Function1<? super java.lang.Integer, Unit> function12 = viewOnClickListenerC39746pyE.values;
        if (function12 != null) {
            function12.invoke(1007);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.hBORwR;
        if (numValueOf != null && numValueOf.intValue() == i) {
            OLrzqt(view.getId());
            C39804pzJ c39804pzJ = this.copydefault;
            if (c39804pzJ != null) {
                c39804pzJ.showAsDropDown(this, 0, -getMeasuredHeight());
            }
            Function1<? super java.lang.Integer, Unit> function1 = this.values;
            if (function1 != null) {
                function1.invoke(1001);
            }
        } else {
            int i2 = C35964oKf.StateListAnimator.sQOHWT;
            if (numValueOf != null && numValueOf.intValue() == i2) {
                OLrzqt(view.getId());
                C39804pzJ c39804pzJ2 = this.AkhnZx;
                if (c39804pzJ2 != null) {
                    c39804pzJ2.showAsDropDown(this, 0, -getMeasuredHeight());
                }
                Function1<? super java.lang.Integer, Unit> function12 = this.values;
                if (function12 != null) {
                    function12.invoke(1002);
                }
            } else {
                int i3 = C35964oKf.StateListAnimator.SePrCP;
                if (numValueOf != null && numValueOf.intValue() == i3) {
                    OLrzqt(view.getId());
                    DrawLineData.copydefault.EZpvd(DrawLineData.LineType.PRICE_LINE);
                    Function1<? super java.lang.Integer, Unit> function13 = this.values;
                    if (function13 != null) {
                        function13.invoke(1003);
                    }
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pyL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC39746pyE.copydefault((EventParamsList) obj);
                        }
                    });
                } else {
                    int i4 = C35964oKf.StateListAnimator.DtA;
                    if (numValueOf != null && numValueOf.intValue() == i4) {
                        OLrzqt(view.getId());
                        DrawLineData.copydefault.EZpvd(DrawLineData.LineType.FIBONACCI);
                        Function1<? super java.lang.Integer, Unit> function14 = this.values;
                        if (function14 != null) {
                            function14.invoke(1004);
                        }
                        TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pyQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return ViewOnClickListenerC39746pyE.AEQbTJ((EventParamsList) obj);
                            }
                        });
                    } else {
                        int i5 = C35964oKf.StateListAnimator.ScLVFT;
                        if (numValueOf != null && numValueOf.intValue() == i5) {
                            android.widget.ImageView imageView = this.djBIcL;
                            if (imageView != null) {
                                Intrinsics.copydefault(imageView != null ? java.lang.Boolean.valueOf(imageView.isSelected()) : null);
                                imageView.setSelected(!r2.booleanValue());
                            }
                            Function1<? super java.lang.Boolean, Unit> function15 = this.DbNXlk;
                            if (function15 != null) {
                                android.widget.ImageView imageView2 = this.djBIcL;
                                java.lang.Boolean boolValueOf = imageView2 != null ? java.lang.Boolean.valueOf(imageView2.isSelected()) : null;
                                Intrinsics.copydefault(boolValueOf);
                                function15.invoke(boolValueOf);
                            }
                            Function1<? super java.lang.Integer, Unit> function16 = this.values;
                            if (function16 != null) {
                                function16.invoke(1005);
                            }
                            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
                            C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pyN
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ViewOnClickListenerC39746pyE.valueOf((EventParamsList) obj);
                                }
                            });
                            AEQbTJ();
                        } else {
                            int i6 = C35964oKf.StateListAnimator.haRtnV;
                            if (numValueOf != null && numValueOf.intValue() == i6) {
                                Function1<? super java.lang.Integer, Unit> function17 = this.values;
                                if (function17 != null) {
                                    function17.invoke(1006);
                                }
                            } else {
                                int i7 = C35964oKf.StateListAnimator.RZOtbZ;
                                if (numValueOf == null || numValueOf.intValue() != i7) {
                                    int i8 = C35964oKf.StateListAnimator.hCiIDQ;
                                    if (numValueOf != null && numValueOf.intValue() == i8) {
                                        Function1<? super java.lang.Integer, Unit> function18 = this.values;
                                        if (function18 != null) {
                                            function18.invoke(1008);
                                        }
                                    } else {
                                        int i9 = C35964oKf.StateListAnimator.zagaMW;
                                        if (numValueOf != null && numValueOf.intValue() == i9) {
                                            OLrzqt(view.getId());
                                            C39804pzJ c39804pzJ3 = this.AEQbTJ;
                                            if (c39804pzJ3 != null) {
                                                android.widget.RelativeLayout relativeLayout = this.ejfBZ;
                                                c39804pzJ3.showAsDropDown(this, 0, relativeLayout != null ? relativeLayout.getMeasuredHeight() : 0);
                                            }
                                            Function1<? super java.lang.Integer, Unit> function19 = this.values;
                                            if (function19 != null) {
                                                function19.invoke(java.lang.Integer.valueOf(PointerIconCompat.TYPE_ALIAS));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Function1<? super java.lang.Integer, Unit> function110 = this.isConnected;
        if (function110 != null) {
            java.lang.Integer numValueOf2 = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
            Intrinsics.copydefault(numValueOf2);
            function110.invoke(numValueOf2);
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DrawLineData.LineType lineTypeValueOf = DrawLineData.copydefault.valueOf();
        eventParamsList.put("app_drawing_tool_type", C33129mqd.gEmmrt(lineTypeValueOf != null ? lineTypeValueOf.getStrName() : null), true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DrawLineData.LineType lineTypeValueOf = DrawLineData.copydefault.valueOf();
        eventParamsList.put("app_drawing_tool_type", C33129mqd.gEmmrt(lineTypeValueOf != null ? lineTypeValueOf.getStrName() : null), true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", "show_hide", true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(int i) {
        android.widget.ImageView imageView = this.AhwBna;
        if (imageView != null) {
            imageView.setSelected(false);
        }
        android.widget.ImageView imageView2 = this.valueOf;
        if (imageView2 != null) {
            imageView2.setSelected(false);
        }
        android.widget.ImageView imageView3 = this.gEmmrt;
        if (imageView3 != null) {
            imageView3.setSelected(false);
        }
        android.widget.ImageView imageView4 = this.AYXKKw;
        if (imageView4 != null) {
            imageView4.setSelected(false);
        }
        android.widget.ImageView imageView5 = this.fetchVPNInfo;
        if (imageView5 != null) {
            imageView5.setSelected(false);
        }
        android.widget.ImageView imageView6 = this.KWHzl;
        if (imageView6 != null) {
            imageView6.setSelected(false);
        }
        android.widget.ImageView imageView7 = this.OLrzqt;
        if (imageView7 != null) {
            imageView7.setSelected(false);
        }
        android.widget.ImageView imageView8 = this.EZpvd;
        if (imageView8 != null) {
            imageView8.setSelected(false);
        }
        if (i == C35964oKf.StateListAnimator.hBORwR) {
            android.widget.ImageView imageView9 = this.AhwBna;
            if (imageView9 != null) {
                imageView9.setSelected(true);
            }
            android.widget.ImageView imageView10 = this.valueOf;
            if (imageView10 != null) {
                imageView10.setSelected(true);
            }
            C39804pzJ c39804pzJ = this.AkhnZx;
            if (c39804pzJ != null) {
                c39804pzJ.copydefault();
            }
            C39804pzJ c39804pzJ2 = this.AEQbTJ;
            if (c39804pzJ2 != null) {
                c39804pzJ2.copydefault();
                return;
            }
            return;
        }
        if (i == C35964oKf.StateListAnimator.sQOHWT) {
            android.widget.ImageView imageView11 = this.gEmmrt;
            if (imageView11 != null) {
                imageView11.setSelected(true);
            }
            android.widget.ImageView imageView12 = this.AYXKKw;
            if (imageView12 != null) {
                imageView12.setSelected(true);
            }
            C39804pzJ c39804pzJ3 = this.copydefault;
            if (c39804pzJ3 != null) {
                c39804pzJ3.copydefault();
            }
            C39804pzJ c39804pzJ4 = this.AEQbTJ;
            if (c39804pzJ4 != null) {
                c39804pzJ4.copydefault();
                return;
            }
            return;
        }
        if (i == C35964oKf.StateListAnimator.SePrCP) {
            android.widget.ImageView imageView13 = this.fetchVPNInfo;
            if (imageView13 != null) {
                imageView13.setSelected(true);
            }
            C39804pzJ c39804pzJ5 = this.copydefault;
            if (c39804pzJ5 != null) {
                c39804pzJ5.copydefault();
            }
            C39804pzJ c39804pzJ6 = this.AkhnZx;
            if (c39804pzJ6 != null) {
                c39804pzJ6.copydefault();
            }
            C39804pzJ c39804pzJ7 = this.AEQbTJ;
            if (c39804pzJ7 != null) {
                c39804pzJ7.copydefault();
                return;
            }
            return;
        }
        if (i == C35964oKf.StateListAnimator.DtA) {
            android.widget.ImageView imageView14 = this.KWHzl;
            if (imageView14 != null) {
                imageView14.setSelected(true);
            }
            C39804pzJ c39804pzJ8 = this.copydefault;
            if (c39804pzJ8 != null) {
                c39804pzJ8.copydefault();
            }
            C39804pzJ c39804pzJ9 = this.AkhnZx;
            if (c39804pzJ9 != null) {
                c39804pzJ9.copydefault();
            }
            C39804pzJ c39804pzJ10 = this.AEQbTJ;
            if (c39804pzJ10 != null) {
                c39804pzJ10.copydefault();
                return;
            }
            return;
        }
        if (i == C35964oKf.StateListAnimator.zagaMW) {
            android.widget.ImageView imageView15 = this.EZpvd;
            if (imageView15 != null) {
                imageView15.setSelected(true);
            }
            android.widget.ImageView imageView16 = this.OLrzqt;
            if (imageView16 != null) {
                imageView16.setSelected(true);
            }
            C39804pzJ c39804pzJ11 = this.copydefault;
            if (c39804pzJ11 != null) {
                c39804pzJ11.copydefault();
            }
            C39804pzJ c39804pzJ12 = this.AkhnZx;
            if (c39804pzJ12 != null) {
                c39804pzJ12.copydefault();
            }
        }
    }

    @Override // o.InterfaceC35967oKi
    public void AEQbTJ() {
        android.widget.ImageView imageView = this.AhwBna;
        if (imageView != null) {
            imageView.setSelected(false);
        }
        android.widget.ImageView imageView2 = this.valueOf;
        if (imageView2 != null) {
            imageView2.setSelected(false);
        }
        android.widget.ImageView imageView3 = this.gEmmrt;
        if (imageView3 != null) {
            imageView3.setSelected(false);
        }
        android.widget.ImageView imageView4 = this.AYXKKw;
        if (imageView4 != null) {
            imageView4.setSelected(false);
        }
        android.widget.ImageView imageView5 = this.fetchVPNInfo;
        if (imageView5 != null) {
            imageView5.setSelected(false);
        }
        android.widget.ImageView imageView6 = this.KWHzl;
        if (imageView6 != null) {
            imageView6.setSelected(false);
        }
        android.widget.ImageView imageView7 = this.OLrzqt;
        if (imageView7 != null) {
            imageView7.setSelected(false);
        }
        android.widget.ImageView imageView8 = this.EZpvd;
        if (imageView8 != null) {
            imageView8.setSelected(false);
        }
        C39804pzJ c39804pzJ = this.copydefault;
        if (c39804pzJ != null) {
            c39804pzJ.copydefault();
        }
        C39804pzJ c39804pzJ2 = this.AkhnZx;
        if (c39804pzJ2 != null) {
            c39804pzJ2.copydefault();
        }
        C39804pzJ c39804pzJ3 = this.AEQbTJ;
        if (c39804pzJ3 != null) {
            c39804pzJ3.copydefault();
        }
    }

    public final void OLrzqt() {
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setSelected(false);
        }
    }

    @Override // o.InterfaceC35967oKi
    public void setShowShareIcon(boolean z) {
        android.widget.RelativeLayout relativeLayout = this.getFieldNames;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }
}
