package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC19442gCn extends wXX implements View.OnClickListener {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public yHO<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Boolean, Unit> AEQbTJ;
    public java.lang.Integer EZpvd;
    public AbstractC16490eks OLrzqt;
    public C8301bAD copydefault = new C8301bAD();

    /* JADX INFO: renamed from: o.gCn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gCn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final ViewOnClickListenerC19442gCn copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCn = new ViewOnClickListenerC19442gCn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("chainId", j);
            bundle.putString("walletId", str);
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2);
            bundle.putString("coinUrl", str3);
            viewOnClickListenerC19442gCn.setArguments(bundle);
            return viewOnClickListenerC19442gCn;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
        android.content.Context context = getContext();
        if (context != null && (string = context.getString(C13754dXa.FragmentManager.RKcVTr)) != null) {
            str = string;
        }
        wxq.setTitle(str);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = (AbstractC16490eks) DataBindingUtil.inflate(getCustomLayoutInflater(), C13754dXa.TaskDescription.DaRZkR, constraintLayout, true);
        OLrzqt();
    }

    public final void OLrzqt() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            long j = arguments.getLong("chainId");
            java.lang.String string2 = arguments.getString("walletId");
            if (string2 == null || (string = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) == null) {
                return;
            }
            final java.lang.String string3 = arguments.getString("coinUrl");
            if (string3 == null) {
                string3 = "";
            }
            AEQbTJ();
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = this.copydefault.KWHzl(string2, j, string);
            final Function1 function1 = new Function1() { // from class: o.gCl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC19442gCn.KWHzl(this.AEQbTJ, string3, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gCq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ViewOnClickListenerC19442gCn.djBIcL(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gCt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC19442gCn.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gCs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ViewOnClickListenerC19442gCn.AYXKKw(function12, obj);
                }
            });
        }
        AbstractC16490eks abstractC16490eks = this.OLrzqt;
        if (abstractC16490eks == null) {
            Intrinsics.gEmmrt("");
            abstractC16490eks = null;
        }
        C19439gCk c19439gCk = abstractC16490eks.KWHzl;
        if (c19439gCk != null) {
            c19439gCk.setOnSelectAddressFinish(new Function1() { // from class: o.gCw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC19442gCn.copydefault(this.EZpvd, (AddressData) obj);
                }
            });
        }
        AbstractC16490eks abstractC16490eks2 = this.OLrzqt;
        if (abstractC16490eks2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16490eks2 = null;
        }
        android.widget.TextView textView = abstractC16490eks2.AEQbTJ;
        android.os.Bundle arguments2 = getArguments();
        java.lang.Long lValueOf = arguments2 != null ? java.lang.Long.valueOf(arguments2.getLong("chainId")) : null;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C13754dXa.FragmentManager.getMaxItemsactivity_release;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(lValueOf);
        java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
        textView.setText(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", strDjBIcL != null ? strDjBIcL : ""))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCn, final java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        AbstractC58260yxt<java.util.List<AddressData>> abstractC58260yxtEZpvd = viewOnClickListenerC19442gCn.copydefault.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.gCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC19442gCn.KWHzl(this.EZpvd, str, (java.util.List) obj);
            }
        };
        abstractC58260yxtEZpvd.copydefault(new InterfaceC58227yxM() { // from class: o.gCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC19442gCn.gEmmrt(function1, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCn, java.lang.String str, java.util.List list) {
        viewOnClickListenerC19442gCn.KWHzl();
        if (list != null) {
            AbstractC16490eks abstractC16490eks = viewOnClickListenerC19442gCn.OLrzqt;
            if (abstractC16490eks == null) {
                Intrinsics.gEmmrt("");
                abstractC16490eks = null;
            }
            C19439gCk c19439gCk = abstractC16490eks.KWHzl;
            if (c19439gCk != null) {
                c19439gCk.setAddressDataList(list);
            }
            AbstractC16490eks abstractC16490eks2 = viewOnClickListenerC19442gCn.OLrzqt;
            if (abstractC16490eks2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16490eks2 = null;
            }
            C19439gCk c19439gCk2 = abstractC16490eks2.KWHzl;
            if (c19439gCk2 != null) {
                c19439gCk2.setHeadUrl(str);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC19442gCn, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCn, java.lang.Throwable th) {
        viewOnClickListenerC19442gCn.KWHzl();
        C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCn, final AddressData addressData) {
        Intrinsics.checkNotNullParameter(addressData, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) addressData.getAddress())) {
            viewOnClickListenerC19442gCn.dismissAllowingStateLoss();
            yHO<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Boolean, Unit> yho = viewOnClickListenerC19442gCn.AEQbTJ;
            if (yho != null) {
                yho.invoke(addressData.getAddress(), java.lang.Integer.valueOf(addressData.getAddressType()), java.lang.Boolean.FALSE);
            }
        } else {
            viewOnClickListenerC19442gCn.copydefault.KWHzl(addressData.getAddressType());
            viewOnClickListenerC19442gCn.EZpvd = java.lang.Integer.valueOf(addressData.getAddressType());
            androidx.fragment.app.FragmentManager childFragmentManager = viewOnClickListenerC19442gCn.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            new C14461dlr(childFragmentManager, "completeAddress-defaultAddressSwtich", new Function1() { // from class: o.gCp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC19442gCn.OLrzqt(this.AEQbTJ, addressData, (java.lang.String) obj);
                }
            }, null, null, false, 48, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCn, AddressData addressData, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        viewOnClickListenerC19442gCn.OLrzqt(str, addressData.getAddressType());
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(java.lang.String str, final int i) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtKWHzl = this.copydefault.KWHzl(str);
        final Function1 function1 = new Function1() { // from class: o.gCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC19442gCn.AEQbTJ(this.copydefault, i, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC19442gCn.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC19442gCn.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC19442gCn.valueOf(function12, obj);
            }
        });
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCn, int i, java.lang.String str) {
        yHO<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Boolean, Unit> yho = viewOnClickListenerC19442gCn.AEQbTJ;
        if (yho != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            yho.invoke(str, java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE);
        }
        viewOnClickListenerC19442gCn.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        return Unit.INSTANCE;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.sbu;
        if (numValueOf != null && numValueOf.intValue() == i) {
            dismissAllowingStateLoss();
        }
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull yHO<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Boolean, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.AEQbTJ = yho;
        show(fragmentManager, str);
    }

    public final void AEQbTJ() {
        AbstractC16490eks abstractC16490eks = this.OLrzqt;
        if (abstractC16490eks == null) {
            Intrinsics.gEmmrt("");
            abstractC16490eks = null;
        }
        abstractC16490eks.OLrzqt.KWHzl(0L);
    }

    public final void KWHzl() {
        AbstractC16490eks abstractC16490eks = this.OLrzqt;
        if (abstractC16490eks == null) {
            Intrinsics.gEmmrt("");
            abstractC16490eks = null;
        }
        abstractC16490eks.OLrzqt.copydefault();
    }
}
