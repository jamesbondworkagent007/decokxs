package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexSwapSmartRoutingMenuVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24491ieo extends android.widget.LinearLayout {
    public C21500hBr AEQbTJ;
    public final java.lang.Object EZpvd;
    public java.util.List<DexSwapSmartRoutingMenuVo> KWHzl;
    public C21497hBo OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24491ieo(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.lang.Object();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24491ieo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.lang.Object();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24491ieo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.lang.Object();
    }

    public final void KWHzl(java.util.List<DexSwapSmartRoutingMenuVo> list, Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = list;
        this.copydefault = function1;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            if (list != null && list.size() == 2) {
                AEQbTJ();
            } else {
                if (list == null || list.size() != 3) {
                    return;
                }
                EZpvd();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AEQbTJ() {
        C21500hBr c21500hBr;
        android.widget.RelativeLayout relativeLayout;
        C21500hBr c21500hBr2;
        android.widget.RelativeLayout relativeLayout2;
        C21500hBr c21500hBr3;
        android.widget.RelativeLayout relativeLayout3;
        C21500hBr c21500hBr4;
        android.widget.RelativeLayout relativeLayout4;
        C21500hBr c21500hBr5;
        android.widget.RelativeLayout relativeLayout5;
        C21500hBr c21500hBr6;
        android.widget.RelativeLayout relativeLayout6;
        this.AEQbTJ = C21500hBr.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        java.util.List<DexSwapSmartRoutingMenuVo> list = this.KWHzl;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    java.lang.String smartRoutingMenuType = list.get(0).getSmartRoutingMenuType();
                    switch (smartRoutingMenuType.hashCode()) {
                        case 49:
                            if (smartRoutingMenuType.equals("1") && (c21500hBr = this.AEQbTJ) != null && (relativeLayout = c21500hBr.EZpvd) != null) {
                                relativeLayout.setTag("1");
                            }
                            break;
                        case 50:
                            if (smartRoutingMenuType.equals("2") && (c21500hBr2 = this.AEQbTJ) != null && (relativeLayout2 = c21500hBr2.EZpvd) != null) {
                                relativeLayout2.setTag("2");
                            }
                            break;
                        case 51:
                            if (smartRoutingMenuType.equals("3") && (c21500hBr3 = this.AEQbTJ) != null && (relativeLayout3 = c21500hBr3.EZpvd) != null) {
                                relativeLayout3.setTag("3");
                            }
                            break;
                    }
                    EZpvd(list.get(0));
                } else if (i == 1) {
                    java.lang.String smartRoutingMenuType2 = list.get(1).getSmartRoutingMenuType();
                    switch (smartRoutingMenuType2.hashCode()) {
                        case 49:
                            if (smartRoutingMenuType2.equals("1") && (c21500hBr4 = this.AEQbTJ) != null && (relativeLayout4 = c21500hBr4.AhwBna) != null) {
                                relativeLayout4.setTag("1");
                            }
                            break;
                        case 50:
                            if (smartRoutingMenuType2.equals("2") && (c21500hBr5 = this.AEQbTJ) != null && (relativeLayout5 = c21500hBr5.AhwBna) != null) {
                                relativeLayout5.setTag("2");
                            }
                            break;
                        case 51:
                            if (smartRoutingMenuType2.equals("3") && (c21500hBr6 = this.AEQbTJ) != null && (relativeLayout6 = c21500hBr6.AhwBna) != null) {
                                relativeLayout6.setTag("3");
                            }
                            break;
                    }
                    AEQbTJ(list.get(1));
                }
            }
        }
        final C21500hBr c21500hBr7 = this.AEQbTJ;
        if (c21500hBr7 != null) {
            android.widget.RelativeLayout relativeLayout7 = c21500hBr7.EZpvd;
            Intrinsics.checkNotNullExpressionValue(relativeLayout7, "");
            android.widget.RelativeLayout relativeLayout8 = c21500hBr7.AhwBna;
            Intrinsics.checkNotNullExpressionValue(relativeLayout8, "");
            EZpvd(relativeLayout7, relativeLayout8);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(c21500hBr7.EZpvd);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(500L, timeUnit);
            InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ieA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.EZpvd(c21500hBr7, this, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: o.iel
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24491ieo.djBIcL((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgThrottleFirst.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ies
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.djBIcL(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            C33050mpD.EZpvd(interfaceC58217yxCSubscribe, this.EZpvd);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(c21500hBr7.AhwBna).throttleFirst(500L, timeUnit);
            InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ieq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.AEQbTJ(c21500hBr7, this, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.iet
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24491ieo.gEmmrt((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCSubscribe2 = abstractC58247yxgThrottleFirst2.subscribe(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ier
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.gEmmrt(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe2, "");
            C33050mpD.EZpvd(interfaceC58217yxCSubscribe2, this.EZpvd);
            c21500hBr7.EZpvd.setSelected(true);
            c21500hBr7.EZpvd.setClickable(false);
        }
    }

    public static final void EZpvd(C21500hBr c21500hBr, C24491ieo c24491ieo, java.lang.Object obj) {
        c21500hBr.EZpvd.setSelected(true);
        c21500hBr.EZpvd.setClickable(false);
        c21500hBr.AhwBna.setSelected(false);
        c21500hBr.AhwBna.setClickable(true);
        android.widget.RelativeLayout relativeLayout = c21500hBr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        android.widget.RelativeLayout relativeLayout2 = c21500hBr.AhwBna;
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "");
        c24491ieo.EZpvd(relativeLayout, relativeLayout2);
        Function1<? super java.lang.String, Unit> function1 = c24491ieo.copydefault;
        if (function1 != null) {
            java.lang.Object tag = c21500hBr.EZpvd.getTag();
            Intrinsics.copydefault(tag, "");
            function1.invoke((java.lang.String) tag);
        }
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AEQbTJ(C21500hBr c21500hBr, C24491ieo c24491ieo, java.lang.Object obj) {
        c21500hBr.AhwBna.setSelected(true);
        c21500hBr.AhwBna.setClickable(false);
        c21500hBr.EZpvd.setSelected(false);
        c21500hBr.EZpvd.setClickable(true);
        android.widget.RelativeLayout relativeLayout = c21500hBr.AhwBna;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        android.widget.RelativeLayout relativeLayout2 = c21500hBr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "");
        c24491ieo.EZpvd(relativeLayout, relativeLayout2);
        Function1<? super java.lang.String, Unit> function1 = c24491ieo.copydefault;
        if (function1 != null) {
            java.lang.Object tag = c21500hBr.AhwBna.getTag();
            Intrinsics.copydefault(tag, "");
            function1.invoke((java.lang.String) tag);
        }
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(android.widget.RelativeLayout relativeLayout, android.widget.RelativeLayout relativeLayout2) {
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        android.content.Context context = getContext();
        layoutParams2.height = C57676yms.EZpvd(context != null ? context.getApplicationContext() : null, 78.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = relativeLayout2.getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        android.content.Context context2 = getContext();
        layoutParams4.height = C57676yms.EZpvd(context2 != null ? context2.getApplicationContext() : null, 72.0f);
        relativeLayout2.setLayoutParams(layoutParams4);
    }

    private final void EZpvd(DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView;
        android.widget.TextView textView3;
        C21500hBr c21500hBr = this.AEQbTJ;
        if (c21500hBr != null && (textView3 = c21500hBr.copydefault) != null) {
            textView3.setText(dexSwapSmartRoutingMenuVo.getMenuLabel());
        }
        C21500hBr c21500hBr2 = this.AEQbTJ;
        if (c21500hBr2 != null && (imageView = c21500hBr2.OLrzqt) != null) {
            DexMultiTokenInfoBean tokenInfo = dexSwapSmartRoutingMenuVo.getTokenInfo();
            java.lang.String tokenLogoUrl = tokenInfo != null ? tokenInfo.getTokenLogoUrl() : null;
            if (tokenLogoUrl == null) {
                tokenLogoUrl = "";
            }
            C25386ivj.loadImageWithBorder$default(imageView, tokenLogoUrl, null, 2, null);
        }
        C21500hBr c21500hBr3 = this.AEQbTJ;
        if (c21500hBr3 != null && (textView2 = c21500hBr3.KWHzl) != null) {
            textView2.setText("1");
        }
        C21500hBr c21500hBr4 = this.AEQbTJ;
        if (c21500hBr4 == null || (textView = c21500hBr4.AEQbTJ) == null) {
            return;
        }
        DexMultiTokenInfoBean tokenInfo2 = dexSwapSmartRoutingMenuVo.getTokenInfo();
        textView.setText(tokenInfo2 != null ? tokenInfo2.getTokenSymbol() : null);
    }

    private final void AEQbTJ(DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView;
        android.widget.TextView textView3;
        C21500hBr c21500hBr = this.AEQbTJ;
        if (c21500hBr != null && (textView3 = c21500hBr.AYXKKw) != null) {
            textView3.setText(dexSwapSmartRoutingMenuVo.getMenuLabel());
        }
        C21500hBr c21500hBr2 = this.AEQbTJ;
        if (c21500hBr2 != null && (imageView = c21500hBr2.valueOf) != null) {
            DexMultiTokenInfoBean tokenInfo = dexSwapSmartRoutingMenuVo.getTokenInfo();
            java.lang.String tokenLogoUrl = tokenInfo != null ? tokenInfo.getTokenLogoUrl() : null;
            if (tokenLogoUrl == null) {
                tokenLogoUrl = "";
            }
            C25386ivj.loadImageWithBorder$default(imageView, tokenLogoUrl, null, 2, null);
        }
        C21500hBr c21500hBr3 = this.AEQbTJ;
        if (c21500hBr3 != null && (textView2 = c21500hBr3.gEmmrt) != null) {
            textView2.setText("2");
        }
        C21500hBr c21500hBr4 = this.AEQbTJ;
        if (c21500hBr4 == null || (textView = c21500hBr4.AkhnZx) == null) {
            return;
        }
        DexMultiTokenInfoBean tokenInfo2 = dexSwapSmartRoutingMenuVo.getTokenInfo();
        textView.setText(tokenInfo2 != null ? tokenInfo2.getTokenSymbol() : null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd() {
        C21497hBo c21497hBo;
        android.widget.RelativeLayout relativeLayout;
        C21497hBo c21497hBo2;
        android.widget.RelativeLayout relativeLayout2;
        C21497hBo c21497hBo3;
        android.widget.RelativeLayout relativeLayout3;
        C21497hBo c21497hBo4;
        android.widget.RelativeLayout relativeLayout4;
        C21497hBo c21497hBo5;
        android.widget.RelativeLayout relativeLayout5;
        C21497hBo c21497hBo6;
        android.widget.RelativeLayout relativeLayout6;
        C21497hBo c21497hBo7;
        android.widget.RelativeLayout relativeLayout7;
        C21497hBo c21497hBo8;
        android.widget.RelativeLayout relativeLayout8;
        C21497hBo c21497hBo9;
        android.widget.RelativeLayout relativeLayout9;
        this.OLrzqt = C21497hBo.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        java.util.List<DexSwapSmartRoutingMenuVo> list = this.KWHzl;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    java.lang.String smartRoutingMenuType = list.get(0).getSmartRoutingMenuType();
                    switch (smartRoutingMenuType.hashCode()) {
                        case 49:
                            if (smartRoutingMenuType.equals("1") && (c21497hBo = this.OLrzqt) != null && (relativeLayout = c21497hBo.AYXKKw) != null) {
                                relativeLayout.setTag("1");
                            }
                            break;
                        case 50:
                            if (smartRoutingMenuType.equals("2") && (c21497hBo2 = this.OLrzqt) != null && (relativeLayout2 = c21497hBo2.AYXKKw) != null) {
                                relativeLayout2.setTag("2");
                            }
                            break;
                        case 51:
                            if (smartRoutingMenuType.equals("3") && (c21497hBo3 = this.OLrzqt) != null && (relativeLayout3 = c21497hBo3.AYXKKw) != null) {
                                relativeLayout3.setTag("3");
                            }
                            break;
                    }
                    OLrzqt(list.get(0));
                } else if (i == 1) {
                    java.lang.String smartRoutingMenuType2 = list.get(1).getSmartRoutingMenuType();
                    switch (smartRoutingMenuType2.hashCode()) {
                        case 49:
                            if (smartRoutingMenuType2.equals("1") && (c21497hBo4 = this.OLrzqt) != null && (relativeLayout4 = c21497hBo4.djBIcL) != null) {
                                relativeLayout4.setTag("1");
                            }
                            break;
                        case 50:
                            if (smartRoutingMenuType2.equals("2") && (c21497hBo5 = this.OLrzqt) != null && (relativeLayout5 = c21497hBo5.djBIcL) != null) {
                                relativeLayout5.setTag("2");
                            }
                            break;
                        case 51:
                            if (smartRoutingMenuType2.equals("3") && (c21497hBo6 = this.OLrzqt) != null && (relativeLayout6 = c21497hBo6.djBIcL) != null) {
                                relativeLayout6.setTag("3");
                            }
                            break;
                    }
                    copydefault(list.get(1));
                } else if (i == 2) {
                    java.lang.String smartRoutingMenuType3 = list.get(2).getSmartRoutingMenuType();
                    switch (smartRoutingMenuType3.hashCode()) {
                        case 49:
                            if (smartRoutingMenuType3.equals("1") && (c21497hBo7 = this.OLrzqt) != null && (relativeLayout7 = c21497hBo7.DbNXlk) != null) {
                                relativeLayout7.setTag("1");
                            }
                            break;
                        case 50:
                            if (smartRoutingMenuType3.equals("2") && (c21497hBo8 = this.OLrzqt) != null && (relativeLayout8 = c21497hBo8.DbNXlk) != null) {
                                relativeLayout8.setTag("2");
                            }
                            break;
                        case 51:
                            if (smartRoutingMenuType3.equals("3") && (c21497hBo9 = this.OLrzqt) != null && (relativeLayout9 = c21497hBo9.DbNXlk) != null) {
                                relativeLayout9.setTag("3");
                            }
                            break;
                    }
                    KWHzl(list.get(2));
                }
            }
        }
        final C21497hBo c21497hBo10 = this.OLrzqt;
        if (c21497hBo10 != null) {
            android.widget.RelativeLayout relativeLayout10 = c21497hBo10.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(relativeLayout10, "");
            android.widget.RelativeLayout relativeLayout11 = c21497hBo10.djBIcL;
            Intrinsics.checkNotNullExpressionValue(relativeLayout11, "");
            android.widget.RelativeLayout relativeLayout12 = c21497hBo10.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(relativeLayout12, "");
            OLrzqt(relativeLayout10, relativeLayout11, relativeLayout12);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(c21497hBo10.AYXKKw);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(500L, timeUnit);
            InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iem
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.gEmmrt(c21497hBo10, this, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: o.iek
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24491ieo.valueOf((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgThrottleFirst.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iep
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.valueOf(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            C33050mpD.EZpvd(interfaceC58217yxCSubscribe, this.EZpvd);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(c21497hBo10.djBIcL).throttleFirst(500L, timeUnit);
            InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.iex
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.OLrzqt(c21497hBo10, this, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.iev
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24491ieo.AYXKKw((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCSubscribe2 = abstractC58247yxgThrottleFirst2.subscribe(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.iey
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.AYXKKw(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe2, "");
            C33050mpD.EZpvd(interfaceC58217yxCSubscribe2, this.EZpvd);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst3 = C8003auW.copydefault(c21497hBo10.DbNXlk).throttleFirst(500L, timeUnit);
            InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM3 = new InterfaceC58227yxM() { // from class: o.ieu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.AEQbTJ(c21497hBo10, this, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.iew
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24491ieo.AhwBna((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCSubscribe3 = abstractC58247yxgThrottleFirst3.subscribe(interfaceC58227yxM3, new InterfaceC58227yxM() { // from class: o.ieB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24491ieo.AhwBna(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe3, "");
            C33050mpD.EZpvd(interfaceC58217yxCSubscribe3, this.EZpvd);
            c21497hBo10.AYXKKw.setSelected(true);
            c21497hBo10.AYXKKw.setClickable(false);
        }
    }

    public static final void gEmmrt(C21497hBo c21497hBo, C24491ieo c24491ieo, java.lang.Object obj) {
        c21497hBo.AYXKKw.setSelected(true);
        c21497hBo.AYXKKw.setClickable(false);
        c21497hBo.djBIcL.setSelected(false);
        c21497hBo.djBIcL.setClickable(true);
        c21497hBo.DbNXlk.setSelected(false);
        c21497hBo.DbNXlk.setClickable(true);
        android.widget.RelativeLayout relativeLayout = c21497hBo.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        android.widget.RelativeLayout relativeLayout2 = c21497hBo.djBIcL;
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "");
        android.widget.RelativeLayout relativeLayout3 = c21497hBo.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(relativeLayout3, "");
        c24491ieo.OLrzqt(relativeLayout, relativeLayout2, relativeLayout3);
        Function1<? super java.lang.String, Unit> function1 = c24491ieo.copydefault;
        if (function1 != null) {
            java.lang.Object tag = c21497hBo.AYXKKw.getTag();
            Intrinsics.copydefault(tag, "");
            function1.invoke((java.lang.String) tag);
        }
    }

    public static final Unit valueOf(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(C21497hBo c21497hBo, C24491ieo c24491ieo, java.lang.Object obj) {
        c21497hBo.djBIcL.setSelected(true);
        c21497hBo.djBIcL.setClickable(false);
        c21497hBo.AYXKKw.setSelected(false);
        c21497hBo.AYXKKw.setClickable(true);
        c21497hBo.DbNXlk.setSelected(false);
        c21497hBo.DbNXlk.setClickable(true);
        android.widget.RelativeLayout relativeLayout = c21497hBo.djBIcL;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        android.widget.RelativeLayout relativeLayout2 = c21497hBo.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "");
        android.widget.RelativeLayout relativeLayout3 = c21497hBo.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(relativeLayout3, "");
        c24491ieo.OLrzqt(relativeLayout, relativeLayout2, relativeLayout3);
        Function1<? super java.lang.String, Unit> function1 = c24491ieo.copydefault;
        if (function1 != null) {
            java.lang.Object tag = c21497hBo.djBIcL.getTag();
            Intrinsics.copydefault(tag, "");
            function1.invoke((java.lang.String) tag);
        }
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AEQbTJ(C21497hBo c21497hBo, C24491ieo c24491ieo, java.lang.Object obj) {
        c21497hBo.DbNXlk.setSelected(true);
        c21497hBo.DbNXlk.setClickable(false);
        c21497hBo.AYXKKw.setSelected(false);
        c21497hBo.AYXKKw.setClickable(true);
        c21497hBo.djBIcL.setSelected(false);
        c21497hBo.djBIcL.setClickable(true);
        android.widget.RelativeLayout relativeLayout = c21497hBo.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        android.widget.RelativeLayout relativeLayout2 = c21497hBo.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "");
        android.widget.RelativeLayout relativeLayout3 = c21497hBo.djBIcL;
        Intrinsics.checkNotNullExpressionValue(relativeLayout3, "");
        c24491ieo.OLrzqt(relativeLayout, relativeLayout2, relativeLayout3);
        Function1<? super java.lang.String, Unit> function1 = c24491ieo.copydefault;
        if (function1 != null) {
            java.lang.Object tag = c21497hBo.DbNXlk.getTag();
            Intrinsics.copydefault(tag, "");
            function1.invoke((java.lang.String) tag);
        }
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(android.widget.RelativeLayout relativeLayout, android.widget.RelativeLayout relativeLayout2, android.widget.RelativeLayout relativeLayout3) {
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        android.content.Context context = getContext();
        layoutParams2.height = C57676yms.EZpvd(context != null ? context.getApplicationContext() : null, 78.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = relativeLayout2.getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        android.content.Context context2 = getContext();
        layoutParams4.height = C57676yms.EZpvd(context2 != null ? context2.getApplicationContext() : null, 72.0f);
        relativeLayout2.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = relativeLayout3.getLayoutParams();
        Intrinsics.copydefault(layoutParams5, "");
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        android.content.Context context3 = getContext();
        layoutParams6.height = C57676yms.EZpvd(context3 != null ? context3.getApplicationContext() : null, 72.0f);
        relativeLayout3.setLayoutParams(layoutParams6);
    }

    private final void OLrzqt(DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView;
        android.widget.TextView textView3;
        C21497hBo c21497hBo = this.OLrzqt;
        if (c21497hBo != null && (textView3 = c21497hBo.KWHzl) != null) {
            textView3.setText(dexSwapSmartRoutingMenuVo.getMenuLabel());
        }
        C21497hBo c21497hBo2 = this.OLrzqt;
        if (c21497hBo2 != null && (imageView = c21497hBo2.AhwBna) != null) {
            DexMultiTokenInfoBean tokenInfo = dexSwapSmartRoutingMenuVo.getTokenInfo();
            java.lang.String tokenLogoUrl = tokenInfo != null ? tokenInfo.getTokenLogoUrl() : null;
            if (tokenLogoUrl == null) {
                tokenLogoUrl = "";
            }
            C25386ivj.loadImageWithBorder$default(imageView, tokenLogoUrl, null, 2, null);
        }
        C21497hBo c21497hBo3 = this.OLrzqt;
        if (c21497hBo3 != null && (textView2 = c21497hBo3.gEmmrt) != null) {
            DexMultiTokenInfoBean tokenInfo2 = dexSwapSmartRoutingMenuVo.getTokenInfo();
            textView2.setText(tokenInfo2 != null ? tokenInfo2.getTokenSymbol() : null);
        }
        C21497hBo c21497hBo4 = this.OLrzqt;
        if (c21497hBo4 == null || (textView = c21497hBo4.valueOf) == null) {
            return;
        }
        textView.setText("1");
    }

    private final void copydefault(DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView;
        android.widget.TextView textView3;
        C21497hBo c21497hBo = this.OLrzqt;
        if (c21497hBo != null && (textView3 = c21497hBo.OLrzqt) != null) {
            textView3.setText(dexSwapSmartRoutingMenuVo.getMenuLabel());
        }
        C21497hBo c21497hBo2 = this.OLrzqt;
        if (c21497hBo2 != null && (imageView = c21497hBo2.copydefault) != null) {
            DexMultiTokenInfoBean tokenInfo = dexSwapSmartRoutingMenuVo.getTokenInfo();
            java.lang.String tokenLogoUrl = tokenInfo != null ? tokenInfo.getTokenLogoUrl() : null;
            if (tokenLogoUrl == null) {
                tokenLogoUrl = "";
            }
            C25386ivj.loadImageWithBorder$default(imageView, tokenLogoUrl, null, 2, null);
        }
        C21497hBo c21497hBo3 = this.OLrzqt;
        if (c21497hBo3 != null && (textView2 = c21497hBo3.AEQbTJ) != null) {
            DexMultiTokenInfoBean tokenInfo2 = dexSwapSmartRoutingMenuVo.getTokenInfo();
            textView2.setText(tokenInfo2 != null ? tokenInfo2.getTokenSymbol() : null);
        }
        C21497hBo c21497hBo4 = this.OLrzqt;
        if (c21497hBo4 == null || (textView = c21497hBo4.EZpvd) == null) {
            return;
        }
        textView.setText("2");
    }

    private final void KWHzl(DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView;
        android.widget.TextView textView3;
        C21497hBo c21497hBo = this.OLrzqt;
        if (c21497hBo != null && (textView3 = c21497hBo.fetchVPNInfo) != null) {
            textView3.setText(dexSwapSmartRoutingMenuVo.getMenuLabel());
        }
        C21497hBo c21497hBo2 = this.OLrzqt;
        if (c21497hBo2 != null && (imageView = c21497hBo2.AkhnZx) != null) {
            DexMultiTokenInfoBean tokenInfo = dexSwapSmartRoutingMenuVo.getTokenInfo();
            java.lang.String tokenLogoUrl = tokenInfo != null ? tokenInfo.getTokenLogoUrl() : null;
            if (tokenLogoUrl == null) {
                tokenLogoUrl = "";
            }
            C25386ivj.loadImageWithBorder$default(imageView, tokenLogoUrl, null, 2, null);
        }
        C21497hBo c21497hBo3 = this.OLrzqt;
        if (c21497hBo3 != null && (textView2 = c21497hBo3.AuCTel) != null) {
            DexMultiTokenInfoBean tokenInfo2 = dexSwapSmartRoutingMenuVo.getTokenInfo();
            textView2.setText(tokenInfo2 != null ? tokenInfo2.getTokenSymbol() : null);
        }
        C21497hBo c21497hBo4 = this.OLrzqt;
        if (c21497hBo4 == null || (textView = c21497hBo4.values) == null) {
            return;
        }
        textView.setText("3");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C33050mpD.OLrzqt(this.EZpvd);
        this.AEQbTJ = null;
        this.OLrzqt = null;
        this.KWHzl = null;
    }
}
