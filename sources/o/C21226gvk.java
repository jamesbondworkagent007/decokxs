package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C10525bqB;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21226gvk extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public java.util.ArrayList<AddressAggregationData> AYXKKw;
    public AbstractC16496eky AhwBna;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public boolean djBIcL;
    public xXB<java.lang.String> fetchVPNInfo;
    public boolean gEmmrt;
    public C8301bAD copydefault = new C8301bAD();
    public int isConnected = 1;
    public java.lang.String AkhnZx = "";
    public long AEQbTJ = -1;
    public long OLrzqt = -1;
    public java.lang.String valueOf = "";
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.gvq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C21226gvk.AEQbTJ(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.isConnected = i;
    }

    /* JADX INFO: renamed from: o.gvk$Activity */
    public static final class Activity implements WalletUpdateWorker.TaskDescription {
        public Activity() {
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void KWHzl() {
            C21226gvk.this.OLrzqt();
            C21226gvk.this.copydefault();
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C21226gvk.this.OLrzqt();
        }
    }

    public final Activity EZpvd() {
        return (Activity) this.DbNXlk.getValue();
    }

    public static final Activity AEQbTJ(C21226gvk c21226gvk) {
        return c21226gvk.new Activity();
    }

    /* JADX INFO: renamed from: o.gvk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gvk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C21226gvk KWHzl(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.util.ArrayList<AddressAggregationData> arrayList, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C21226gvk c21226gvk = new C21226gvk();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("chainId", j);
            bundle.putLong("coinId", j2);
            bundle.putString("walletId", str);
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2);
            bundle.putBoolean("isHideHeader", z);
            bundle.putBoolean("isSwitchMode", z2);
            bundle.putParcelableArrayList("dataList", arrayList);
            c21226gvk.setArguments(bundle);
            c21226gvk.KWHzl = function1;
            return c21226gvk;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        AbstractC16496eky abstractC16496eky = (AbstractC16496eky) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.QXDzTk, viewGroup, false);
        this.AhwBna = abstractC16496eky;
        AbstractC16496eky abstractC16496eky2 = null;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        C21229gvn c21229gvn = abstractC16496eky.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c21229gvn.setFragmentManager(childFragmentManager);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AEQbTJ = arguments.getLong("chainId");
            this.OLrzqt = arguments.getLong("coinId");
            java.lang.String string = arguments.getString("walletId");
            if (string == null) {
                string = "";
            }
            this.AkhnZx = string;
            java.lang.String string2 = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            if (string2 == null) {
                string2 = "";
            }
            this.valueOf = string2;
            this.gEmmrt = arguments.getBoolean("isHideHeader");
            this.djBIcL = arguments.getBoolean("isSwitchMode");
            java.util.ArrayList<AddressAggregationData> parcelableArrayList = arguments.getParcelableArrayList("dataList");
            if (parcelableArrayList == null) {
                parcelableArrayList = new java.util.ArrayList<>();
            }
            this.AYXKKw = parcelableArrayList;
        }
        AEQbTJ(this.gEmmrt);
        djBIcL();
        AbstractC16496eky abstractC16496eky3 = this.AhwBna;
        if (abstractC16496eky3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16496eky2 = abstractC16496eky3;
        }
        android.view.View root = abstractC16496eky2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        java.util.ArrayList<AddressAggregationData> arrayList = null;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.EZpvd.setOnSelectAddressFinish(new Function1() { // from class: o.gvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21226gvk.AEQbTJ(this.KWHzl, (AddressAggregationData) obj);
            }
        });
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(EZpvd());
        OLrzqt();
        java.util.ArrayList<AddressAggregationData> arrayList2 = this.AYXKKw;
        if (arrayList2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arrayList = arrayList2;
        }
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 0)) {
            KWHzl();
            view.post(new java.lang.Runnable() { // from class: o.gvv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C21226gvk.OLrzqt(this.OLrzqt);
                }
            });
        } else {
            copydefault();
        }
    }

    public static final Unit AEQbTJ(final C21226gvk c21226gvk, AddressAggregationData addressAggregationData) {
        Intrinsics.checkNotNullParameter(addressAggregationData, "");
        if (!addressAggregationData.isChosenGenerateButton()) {
            xXB<java.lang.String> xxb = c21226gvk.fetchVPNInfo;
            if (xxb != null) {
                xxb.AEQbTJ(addressAggregationData.getAddress());
            }
            close$default(c21226gvk, null, 1, null);
            Function1<? super java.lang.String, Unit> function1 = c21226gvk.KWHzl;
            if (function1 != null) {
                function1.invoke(addressAggregationData.getAddress());
            }
        } else {
            androidx.fragment.app.FragmentManager childFragmentManager = c21226gvk.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            new C14461dlr(childFragmentManager, "competeAddress-addressChoose", new Function1() { // from class: o.gvu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21226gvk.copydefault(this.AEQbTJ, (java.lang.String) obj);
                }
            }, null, null, false, 48, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C21226gvk c21226gvk, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c21226gvk.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C21226gvk c21226gvk) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21226gvk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl() {
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        java.util.ArrayList<AddressAggregationData> arrayList = null;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        C21229gvn c21229gvn = abstractC16496eky.EZpvd;
        java.util.ArrayList<AddressAggregationData> arrayList2 = this.AYXKKw;
        if (arrayList2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arrayList = arrayList2;
        }
        c21229gvn.setAddressDataList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        final java.util.HashMap map = new java.util.HashMap();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(this.OLrzqt));
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.AkhnZx, false);
        final Function1 function1 = new Function1() { // from class: o.gvw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21226gvk.EZpvd(objectRef, this, map, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gvB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C21226gvk.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(abstractC58260yxtOLrzqt2, this);
        final Function1 function12 = new Function1() { // from class: o.gvC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21226gvk.OLrzqt(this.AEQbTJ, arrayList, map, c10854bwMKWHzl, objectRef, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21226gvk.djBIcL(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21226gvk.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21226gvk.AhwBna(function13, obj);
            }
        });
    }

    public static final InterfaceC58261yxu AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu EZpvd(Ref.ObjectRef objectRef, final C21226gvk c21226gvk, java.util.HashMap map, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        java.lang.String str = c21226gvk.djBIcL ? c21226gvk.valueOf : "";
        java.util.List<C10525bqB> listAYXKKw = abstractC12782ctV.AYXKKw(c21226gvk.OLrzqt);
        if (listAYXKKw != null) {
            for (C10525bqB c10525bqB : listAYXKKw) {
                map.put(c10525bqB.zuBGHE(), c10525bqB);
            }
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = c21226gvk.copydefault.KWHzl(c21226gvk.AkhnZx, c21226gvk.AEQbTJ, str);
        final Function1 function1 = new Function1() { // from class: o.gvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21226gvk.EZpvd(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.gvt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C21226gvk.OLrzqt(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C21226gvk c21226gvk, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c21226gvk.copydefault.EZpvd();
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit OLrzqt(C21226gvk c21226gvk, java.util.ArrayList arrayList, java.util.HashMap map, C10854bwM c10854bwM, Ref.ObjectRef objectRef, java.util.List list) {
        C10525bqB c10525bqBAEQbTJ;
        C10525bqB c10525bqB;
        java.util.ArrayList arrayList2 = arrayList;
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AddressData addressData = (AddressData) it.next();
            if (c21226gvk.djBIcL) {
                C10525bqB c10525bqB2 = (C10525bqB) map.get(addressData.getAddress());
                if (c10525bqB2 == null) {
                    if (c10854bwM != null) {
                        C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                        T t = objectRef.element;
                        Intrinsics.copydefault(t);
                        c10525bqBAEQbTJ = stateListAnimator.AEQbTJ(c10854bwM, (AbstractC12782ctV) t, addressData.getAddress());
                    } else {
                        c10525bqBAEQbTJ = null;
                    }
                    if (c10525bqBAEQbTJ != null) {
                        arrayList2.add(new AddressAggregationData(c10525bqBAEQbTJ.KWHzl().AhwBna(), addressData.getAddress().length() == 0, addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqBAEQbTJ, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqBAEQbTJ, false, 1, null), c10525bqBAEQbTJ.AwvSrB(), c10525bqBAEQbTJ.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqBAEQbTJ.fIwbmz(), c10525bqBAEQbTJ.AhwBna(), c10525bqBAEQbTJ.KWHzl().QfsBiF(), false, false, 24576, null));
                    }
                } else {
                    arrayList2.add(new AddressAggregationData(c10525bqB2.KWHzl().AhwBna(), c10525bqB2.DTwDnp(), addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB2, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqB2, false, 1, null), c10525bqB2.AwvSrB(), c10525bqB2.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqB2.fIwbmz(), c10525bqB2.AhwBna(), c10525bqB2.KWHzl().QfsBiF(), false, false, 24576, null));
                }
            } else if (addressData.isSupported() && (c10525bqB = (C10525bqB) map.get(addressData.getAddress())) != null && C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), "0")) {
                arrayList2.add(new AddressAggregationData(c10525bqB.KWHzl().AhwBna(), c10525bqB.DTwDnp(), addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqB, false, 1, null), c10525bqB.AwvSrB(), c10525bqB.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqB.fIwbmz(), c10525bqB.AhwBna(), c10525bqB.KWHzl().QfsBiF(), false, false, 24576, null));
            }
        }
        java.util.List<AddressAggregationData> listEZpvd = arrayList2;
        if (c21226gvk.djBIcL) {
            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList2, C10530bqG.EZpvd);
        }
        if (listEZpvd != null) {
            AbstractC16496eky abstractC16496eky = c21226gvk.AhwBna;
            if (abstractC16496eky == null) {
                Intrinsics.gEmmrt("");
                abstractC16496eky = null;
            }
            C21229gvn c21229gvn = abstractC16496eky.EZpvd;
            if (c21229gvn != null) {
                c21229gvn.setAddressDataList(listEZpvd);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21226gvk, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(EZpvd());
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
        show(fragmentManager, str);
    }

    public final void AEQbTJ() {
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.AEQbTJ.KWHzl(0L);
    }

    public final void OLrzqt() {
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.AEQbTJ.copydefault();
    }

    public static /* synthetic */ void hideHeader$default(C21226gvk c21226gvk, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c21226gvk.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        AbstractC16496eky abstractC16496eky = null;
        if (z) {
            AbstractC16496eky abstractC16496eky2 = this.AhwBna;
            if (abstractC16496eky2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16496eky = abstractC16496eky2;
            }
            abstractC16496eky.copydefault.setVisibility(8);
            return;
        }
        AbstractC16496eky abstractC16496eky3 = this.AhwBna;
        if (abstractC16496eky3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky3 = null;
        }
        abstractC16496eky3.copydefault.setVisibility(0);
        AbstractC16496eky abstractC16496eky4 = this.AhwBna;
        if (abstractC16496eky4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16496eky = abstractC16496eky4;
        }
        abstractC16496eky.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C21226gvk.copydefault(this.AEQbTJ, view);
            }
        });
    }

    public static final void copydefault(C21226gvk c21226gvk, android.view.View view) {
        close$default(c21226gvk, null, 1, null);
    }

    private final void djBIcL() {
        AbstractC16496eky abstractC16496eky = this.AhwBna;
        AbstractC16496eky abstractC16496eky2 = null;
        if (abstractC16496eky == null) {
            Intrinsics.gEmmrt("");
            abstractC16496eky = null;
        }
        abstractC16496eky.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.findMenuPanel));
        AbstractC16496eky abstractC16496eky3 = this.AhwBna;
        if (abstractC16496eky3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16496eky2 = abstractC16496eky3;
        }
        abstractC16496eky2.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invalidatePanelMenu));
    }

    public static /* synthetic */ void close$default(C21226gvk c21226gvk, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        c21226gvk.copydefault(bundle);
    }

    public final void copydefault(android.os.Bundle bundle) {
        dismissAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof xXB) {
            this.fetchVPNInfo = (xXB) context;
        }
    }
}
