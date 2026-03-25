package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData;
import com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.ActivityC13789dYi;
import o.ActivityC20997grT;
import o.C10525bqB;
import o.C12827cuN;
import o.C13754dXa;
import o.C9694baS;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gjd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20583gjd extends AbstractC20518giR {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public AbstractC16496eky AhwBna;
    public boolean AkhnZx;
    public boolean DbNXlk;
    public TransactionInfo fARcdN;
    public boolean fetchVPNInfo;
    public boolean isConnected;
    public C8301bAD OLrzqt = new C8301bAD();
    public java.lang.String fIwbmz = "";
    public long EZpvd = -1;
    public long AEQbTJ = -1;
    public java.lang.String valueOf = "";
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.gjw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20583gjd.EZpvd(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.gjd$TaskDescription */
    public static final class TaskDescription implements WalletUpdateWorker.TaskDescription {
        public TaskDescription() {
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void KWHzl() {
            C20583gjd.this.dismissLoading();
            C20583gjd.this.djBIcL();
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C20583gjd.this.dismissLoading();
        }
    }

    public final TaskDescription EZpvd() {
        return (TaskDescription) this.values.getValue();
    }

    public static final TaskDescription EZpvd(C20583gjd c20583gjd) {
        return c20583gjd.new TaskDescription();
    }

    /* JADX INFO: renamed from: o.gjd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gjd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C20583gjd copydefault(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, boolean z2, boolean z3, TransactionInfo transactionInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C20583gjd c20583gjd = new C20583gjd();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("chainId", j);
            bundle.putLong("coinId", j2);
            bundle.putString("walletId", str);
            bundle.putString("from", str2);
            bundle.putBoolean("isFirstTimeUse", z);
            bundle.putString("currentAddress", str3);
            bundle.putBoolean("isSwitchMode", z2);
            bundle.putBoolean("isCloseGenerateFunction", z3);
            bundle.putParcelable("scanTransInfo", transactionInfo);
            c20583gjd.setArguments(bundle);
            return c20583gjd;
        }
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16496eky abstractC16496eky = (AbstractC16496eky) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.QXDzTk, viewGroup, false);
        this.AhwBna = abstractC16496eky;
        AbstractC16496eky abstractC16496eky2 = null;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.KWHzl.setVisibility(8);
        AbstractC16496eky abstractC16496eky3 = this.AhwBna;
        if (abstractC16496eky3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky3 = null;
        }
        C21229gvn c21229gvn = abstractC16496eky3.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c21229gvn.setFragmentManager(childFragmentManager);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.EZpvd = arguments.getLong("chainId");
            this.AEQbTJ = arguments.getLong("coinId");
            java.lang.String string = arguments.getString("walletId");
            if (string == null) {
                string = "";
            }
            this.fIwbmz = string;
            java.lang.String string2 = arguments.getString("currentAddress");
            if (string2 == null) {
                string2 = "";
            }
            this.valueOf = string2;
            this.isConnected = arguments.getBoolean("isSwitchMode");
            this.fetchVPNInfo = arguments.getBoolean("isFirstTimeUse");
            this.AkhnZx = arguments.getBoolean("isCloseGenerateFunction");
            this.fARcdN = (TransactionInfo) arguments.getParcelable("scanTransInfo");
        }
        valueOf();
        AbstractC16496eky abstractC16496eky4 = this.AhwBna;
        if (abstractC16496eky4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16496eky2 = abstractC16496eky4;
        }
        return abstractC16496eky2.getRoot();
    }

    @Override // o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.EZpvd.setOnSelectAddressFinish(new Function1() { // from class: o.gjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20583gjd.EZpvd(this.EZpvd, (AddressAggregationData) obj);
            }
        });
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(EZpvd());
        dismissLoading();
        djBIcL();
    }

    public static final Unit EZpvd(final C20583gjd c20583gjd, AddressAggregationData addressAggregationData) {
        Intrinsics.checkNotNullParameter(addressAggregationData, "");
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c20583gjd.AEQbTJ));
        if (!addressAggregationData.isChosenGenerateButton()) {
            java.lang.String address = addressAggregationData.getAddress();
            android.os.Bundle arguments = c20583gjd.getArguments();
            java.lang.String string = arguments != null ? arguments.getString("from") : null;
            if (string != null && string.hashCode() == 950855502 && string.equals("from_receive")) {
                c20583gjd.OLrzqt(address);
            } else if (c10854bwMKWHzl != null && c10854bwMKWHzl.hUfVAv()) {
                c20583gjd.copydefault(address);
            } else {
                c20583gjd.KWHzl(address);
            }
        } else {
            androidx.fragment.app.FragmentManager childFragmentManager = c20583gjd.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            new C14461dlr(childFragmentManager, "completeAddress", new Function1() { // from class: o.gje
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20583gjd.KWHzl(this.KWHzl, (java.lang.String) obj);
                }
            }, null, null, false, 48, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C20583gjd c20583gjd, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c20583gjd.showLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        final java.util.HashMap map = new java.util.HashMap();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(this.AEQbTJ));
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.fIwbmz, false);
        final Function1 function1 = new Function1() { // from class: o.gji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20583gjd.copydefault(objectRef, this, map, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gjn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20583gjd.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(abstractC58260yxtOLrzqt2, this);
        final Function1 function12 = new Function1() { // from class: o.gjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20583gjd.KWHzl(arrayList, this, map, c10854bwMKWHzl, objectRef, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20583gjd.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20583gjd.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20583gjd.valueOf(function13, obj);
            }
        });
    }

    public static final InterfaceC58261yxu copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu copydefault(Ref.ObjectRef objectRef, final C20583gjd c20583gjd, java.util.HashMap map, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        java.lang.String str = c20583gjd.isConnected ? c20583gjd.valueOf : "";
        java.util.List<C10525bqB> listAYXKKw = abstractC12782ctV.AYXKKw(c20583gjd.AEQbTJ);
        if (listAYXKKw != null) {
            for (C10525bqB c10525bqB : listAYXKKw) {
                map.put(c10525bqB.zuBGHE(), c10525bqB);
            }
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = c20583gjd.OLrzqt.KWHzl(c20583gjd.fIwbmz, c20583gjd.EZpvd, str);
        final Function1 function1 = new Function1() { // from class: o.gjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20583gjd.AEQbTJ(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.gjj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20583gjd.AYXKKw(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C20583gjd c20583gjd, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c20583gjd.OLrzqt.EZpvd();
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(java.util.ArrayList arrayList, C20583gjd c20583gjd, java.util.HashMap map, C10854bwM c10854bwM, Ref.ObjectRef objectRef, java.util.List list) {
        C10525bqB c10525bqBAEQbTJ;
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AddressData addressData = (AddressData) it.next();
            if (c20583gjd.isConnected) {
                C10525bqB c10525bqB = (C10525bqB) map.get(addressData.getAddress());
                if (c10525bqB == null) {
                    if (c10854bwM != null) {
                        C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                        T t = objectRef.element;
                        Intrinsics.copydefault(t);
                        c10525bqBAEQbTJ = stateListAnimator.AEQbTJ(c10854bwM, (AbstractC12782ctV) t, addressData.getAddress());
                    } else {
                        c10525bqBAEQbTJ = null;
                    }
                    if (!c20583gjd.AEQbTJ(c20583gjd.AkhnZx, addressData.getAddress(), addressData.isSupported()) && c10525bqBAEQbTJ != null) {
                        arrayList.add(new AddressAggregationData(c10525bqBAEQbTJ.KWHzl().AhwBna(), addressData.getAddress().length() == 0, addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqBAEQbTJ, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqBAEQbTJ, false, 1, null), c10525bqBAEQbTJ.AwvSrB(), c10525bqBAEQbTJ.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqBAEQbTJ.fIwbmz(), c10525bqBAEQbTJ.AhwBna(), c10525bqBAEQbTJ.KWHzl().QfsBiF(), false, false, 8192, null));
                    }
                } else {
                    arrayList.add(new AddressAggregationData(c10525bqB.KWHzl().AhwBna(), c10525bqB.DTwDnp(), addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqB, false, 1, null), c10525bqB.AwvSrB(), c10525bqB.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqB.fIwbmz(), c10525bqB.AhwBna(), c10525bqB.KWHzl().QfsBiF(), false, false, 8192, null));
                }
            } else if (addressData.isSupported()) {
                C10525bqB c10525bqB2 = (C10525bqB) map.get(addressData.getAddress());
                if (c10525bqB2 != null) {
                    if (C33129mqd.AEQbTJ(c10525bqB2.fIwbmz(), "0")) {
                        arrayList.add(new AddressAggregationData(c10525bqB2.KWHzl().AhwBna(), c10525bqB2.DTwDnp(), addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB2, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqB2, false, 1, null), c10525bqB2.AwvSrB(), c10525bqB2.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqB2.fIwbmz(), c10525bqB2.AhwBna(), c10525bqB2.KWHzl().QfsBiF(), false, false, 8192, null));
                    } else {
                        c20583gjd.DbNXlk = true;
                    }
                } else {
                    c20583gjd.DbNXlk = true;
                }
            }
        }
        java.util.List<AddressAggregationData> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, C10530bqG.EZpvd);
        if (listEZpvd != null) {
            AbstractC16496eky abstractC16496eky = c20583gjd.AhwBna;
            if (abstractC16496eky == null) {
                Intrinsics.gEmmrt("");
                abstractC16496eky = null;
            }
            C21229gvn c21229gvn = abstractC16496eky.EZpvd;
            if (c21229gvn != null) {
                c21229gvn.setAddressDataList(listEZpvd);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20583gjd, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(boolean z, java.lang.String str, boolean z2) {
        return z && str.length() == 0 && z2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(EZpvd());
    }

    private final void valueOf() {
        AbstractC16496eky abstractC16496eky = null;
        if (KWHzl()) {
            AbstractC16496eky abstractC16496eky2 = this.AhwBna;
            if (abstractC16496eky2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16496eky2 = null;
            }
            abstractC16496eky2.copydefault.setVisibility(0);
            AbstractC16496eky abstractC16496eky3 = this.AhwBna;
            if (abstractC16496eky3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16496eky = abstractC16496eky3;
            }
            abstractC16496eky.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gju
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20583gjd.AEQbTJ(this.copydefault, view);
                }
            });
            return;
        }
        AbstractC16496eky abstractC16496eky4 = this.AhwBna;
        if (abstractC16496eky4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky4 = null;
        }
        abstractC16496eky4.copydefault.setVisibility(8);
        AbstractC16496eky abstractC16496eky5 = this.AhwBna;
        if (abstractC16496eky5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky5 = null;
        }
        C21229gvn c21229gvn = abstractC16496eky5.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c21229gvn, "");
        if (c21229gvn.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = c21229gvn.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) layoutParams)).topMargin = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
    }

    public static final void AEQbTJ(C20583gjd c20583gjd, android.view.View view) {
        AbstractC57212yeE.close$default(c20583gjd, null, 1, null);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.AEQbTJ.KWHzl(0L);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.AEQbTJ.copydefault();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.grR.TaskDescription.newInstance$default(o.grR$TaskDescription, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, int, long, java.lang.String, int, o.xXq, int, java.lang.Object):o.grR */
    public final void OLrzqt(java.lang.String str) {
        if (KWHzl()) {
            AbstractC57212yeE.addFragment$default(this, ViewOnClickListenerC20995grR.Companion.copydefault(this.fIwbmz, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.AEQbTJ)), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : this.fetchVPNInfo, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : str, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null), false, false, 6, null);
            return;
        }
        C9694baS.Application application = C9694baS.Companion;
        ActivityC20997grT.ActionBar actionBar = ActivityC20997grT.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        application.KWHzl(this, actionBar.AEQbTJ(context, this.fIwbmz, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.AEQbTJ)), this.fetchVPNInfo, str), new Function2() { // from class: o.gjh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20583gjd.djBIcL(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit djBIcL(C20583gjd c20583gjd, int i, android.content.Intent intent) {
        if (i == -1) {
            c20583gjd.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment.Application.newInstance$default(com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment$Application, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.scan.TransactionInfo, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.tx.TransactionType, java.lang.String, int, java.lang.Object):com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment */
    public final void KWHzl(java.lang.String str) {
        if (KWHzl()) {
            AbstractC57212yeE.addFragment$default(this, TransferInputAddressFragment.Companion.OLrzqt(this.fIwbmz, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.AEQbTJ)), this.fARcdN, "from_home", (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? null : null, str), false, false, 6, null);
            return;
        }
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C9694baS.Companion.KWHzl(this, gFI.Companion.EZpvd(context, this.fIwbmz, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.AEQbTJ)), this.fARcdN, "from_home", (96 & 32) != 0 ? "" : null, (96 & 64) != 0 ? null : null, str), new Function2() { // from class: o.gjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20583gjd.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit copydefault(C20583gjd c20583gjd, int i, android.content.Intent intent) {
        if (i == -1) {
            c20583gjd.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str) {
        C9694baS.Application application = C9694baS.Companion;
        ActivityC13789dYi.ActionBar actionBar = ActivityC13789dYi.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        application.KWHzl(this, actionBar.OLrzqt(context, this.AEQbTJ, this.fIwbmz, this.fARcdN, str), new Function2() { // from class: o.gjf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20583gjd.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit OLrzqt(C20583gjd c20583gjd, int i, android.content.Intent intent) {
        if (i == -1) {
            c20583gjd.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }
}
