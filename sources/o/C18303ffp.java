package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.home.XLayerAddressData;
import com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18303ffp extends AbstractC33073mpa {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final LiveData<Unit> AYXKKw;
    public final java.util.List<QuickCopyAddressItemBean> AhwBna;
    public final MutableLiveData<java.util.List<InterfaceC55105xdf>> DbNXlk;
    public final MutableLiveData<Unit> EZpvd;
    public final int KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public final MutableLiveData<java.util.ArrayList<QuickCopyAddressItemBean>> copydefault;
    public final java.util.ArrayList<QuickCopyAddressItemBean> djBIcL;
    public java.lang.String gEmmrt;
    public final MutableLiveData<java.lang.Boolean> valueOf;
    public final C12827cuN values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18303ffp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<QuickCopyAddressItemBean>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<InterfaceC55105xdf>> copydefault() {
        return this.DbNXlk;
    }

    public final boolean copydefault(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0007: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:26) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:26)) : (r1v0 o.cuN))
 A[MD:(o.cuN):void (m)] (LINE:25) call: o.ffp.<init>(o.cuN):void type: THIS */
    public /* synthetic */ C18303ffp(C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    public C18303ffp(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.values = c12827cuN;
        this.KWHzl = 10;
        this.copydefault = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.djBIcL = new java.util.ArrayList<>();
        this.AhwBna = new java.util.ArrayList();
        this.AEQbTJ = new java.util.ArrayList();
        this.gEmmrt = "";
        MutableLiveData<Unit> mutableLiveData = new MutableLiveData<>(Unit.INSTANCE);
        this.EZpvd = mutableLiveData;
        this.AYXKKw = mutableLiveData;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.djBIcL.clear();
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.values.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.ffF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18303ffp.EZpvd(this.copydefault, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.ffE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18303ffp.AkhnZx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ffs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18303ffp.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt2.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.ffw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18303ffp.gEmmrt(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.ffy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18303ffp.AEQbTJ(this.OLrzqt, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ffv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18303ffp.AYXKKw(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.ffx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18303ffp.KWHzl((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ffu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18303ffp.valueOf(function14, obj);
            }
        });
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
        this.OLrzqt = interfaceC58217yxCAEQbTJ;
    }

    public static final InterfaceC58261yxu AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C18303ffp c18303ffp, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.List<C10854bwM> listOFhtUX = abstractC12782ctV.OFhtUX();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOFhtUX) {
            if (((C10854bwM) obj).iRxXKY()) {
                arrayList.add(obj);
            }
        }
        AbstractC58260yxt<java.util.List<kotlin.Pair<C10854bwM, java.util.List<AddressData>>>> abstractC58260yxtKWHzl = c18303ffp.KWHzl(abstractC12782ctV, arrayList);
        final Function1 function1 = new Function1() { // from class: o.ffC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C18303ffp.AEQbTJ(abstractC12782ctV, (java.util.List) obj2);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.ffG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C18303ffp.isConnected(function1, obj2);
            }
        });
    }

    public static final kotlin.Pair isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(abstractC12782ctV, list);
    }

    public static final java.util.ArrayList gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.ArrayList AEQbTJ(C18303ffp c18303ffp, kotlin.Pair pair) {
        java.lang.String address;
        T t;
        int i;
        java.lang.Object objM7377constructorimpl;
        C10854bwM c10854bwM;
        java.util.List listGEmmrt;
        ChainAddress chainAddressAddressFromChainId$default;
        java.lang.Object next;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) first;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.util.List list = (java.util.List) second;
        java.util.HashMap map = new java.util.HashMap();
        int i2 = 1;
        if (!c18303ffp.AEQbTJ.isEmpty()) {
            c18303ffp.AEQbTJ.clear();
        }
        if (!c18303ffp.AhwBna.isEmpty()) {
            c18303ffp.AhwBna.clear();
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10854bwM c10854bwM2 : abstractC12782ctV.OFhtUX()) {
            QuickCopyAddressItemBean quickCopyAddressItemBean = new QuickCopyAddressItemBean(null, 0L, null, null, null, false, null, false, 0, false, false, null, 0, false, null, 32767, null);
            java.lang.String str2 = str;
            ChainAddress chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM2.AEQbTJ(), null, 2, null);
            if (chainAddressAddressFromChainId$default2 == null || (address = chainAddressAddressFromChainId$default2.getAddress()) == null) {
                address = str2;
            }
            quickCopyAddressItemBean.setAddress(address);
            quickCopyAddressItemBean.setCoinId(c10854bwM2.AhwBna());
            quickCopyAddressItemBean.setCoinUrl(c10854bwM2.AYXKKw());
            quickCopyAddressItemBean.setChainName(c10854bwM2.djBIcL());
            quickCopyAddressItemBean.setCoinSymbol(c10854bwM2.fJNWhG());
            quickCopyAddressItemBean.setEos(c10854bwM2.OuxcSI());
            quickCopyAddressItemBean.setWalletType(abstractC12782ctV.QwvEab());
            quickCopyAddressItemBean.setHotNetwork(c10854bwM2.hBpjJd());
            quickCopyAddressItemBean.setHotNetworkRank(c10854bwM2.ORxRYg());
            if (c10854bwM2.iRxXKY()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C10854bwM) ((kotlin.Pair) next).getFirst()).AhwBna() == c10854bwM2.AhwBna()) {
                        break;
                    }
                }
                kotlin.Pair pair2 = (kotlin.Pair) next;
                t = pair2 != null ? (java.util.List) pair2.getSecond() : 0;
            }
            objectRef.element = t;
            try {
                Result.Application application = Result.Companion;
                C10854bwM c10854bwM3 = c10854bwM2.DGgnkA() ? c10854bwM2 : null;
                if (c10854bwM3 == null || (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM3.AEQbTJ(), null, 2, null)) == null) {
                    i = 0;
                    listGEmmrt = null;
                } else {
                    XLayerAddressData[] xLayerAddressDataArr = new XLayerAddressData[2];
                    i = 0;
                    try {
                        xLayerAddressDataArr[0] = new XLayerAddressData(chainAddressAddressFromChainId$default.getAddress(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSupportActionModeStarted));
                        xLayerAddressDataArr[1] = new XLayerAddressData(c10854bwM3.AEQbTJ(chainAddressAddressFromChainId$default.getAddress()), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSupportContentChanged));
                        listGEmmrt = yDY.gEmmrt(xLayerAddressDataArr);
                        if (c10854bwM3.DGOPHZDGOPHZ()) {
                            listGEmmrt = CollectionsKt___CollectionsKt.gkJEwt(listGEmmrt);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(listGEmmrt);
            } catch (java.lang.Throwable th2) {
                th = th2;
                i = 0;
            }
            java.lang.Object obj = objM7377constructorimpl;
            boolean zM7383isFailureimpl = Result.m7383isFailureimpl(obj);
            T t2 = obj;
            if (zM7383isFailureimpl) {
                t2 = 0;
            }
            objectRef2.element = t2;
            if (c10854bwM2.DGgnkA()) {
                c10854bwM = c10854bwM2;
                c18303ffp.AEQbTJ(c10854bwM, quickCopyAddressItemBean, c18303ffp.djBIcL);
            } else {
                c10854bwM = c10854bwM2;
                c18303ffp.copydefault(c10854bwM, (java.util.List) objectRef.element, quickCopyAddressItemBean, c18303ffp.djBIcL);
            }
            if (c18303ffp.gEmmrt.length() == 0) {
                if (quickCopyAddressItemBean.isHotNetwork() && !abstractC12782ctV.AwvSrB() && !abstractC12782ctV.getFieldNames()) {
                    if (c10854bwM.iRxXKY()) {
                        java.util.List<AddressData> listAhwBna = (java.util.List) objectRef.element;
                        if (listAhwBna == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        QuickCopyAddressItemBean quickCopyAddressItemBeanAEQbTJ = c18303ffp.AEQbTJ(abstractC12782ctV, c10854bwM, listAhwBna);
                        if (quickCopyAddressItemBeanAEQbTJ != null) {
                            c18303ffp.AhwBna.add(quickCopyAddressItemBeanAEQbTJ);
                        }
                    } else if (c10854bwM.DGgnkA()) {
                        java.util.List<XLayerAddressData> listAhwBna2 = (java.util.List) objectRef2.element;
                        if (listAhwBna2 == null) {
                            listAhwBna2 = yDY.AhwBna();
                        }
                        QuickCopyAddressItemBean quickCopyAddressItemBeanOLrzqt = c18303ffp.OLrzqt(abstractC12782ctV, c10854bwM, listAhwBna2);
                        if (quickCopyAddressItemBeanOLrzqt != null) {
                            c18303ffp.AhwBna.add(quickCopyAddressItemBeanOLrzqt);
                        }
                    } else {
                        c18303ffp.AhwBna.add(quickCopyAddressItemBean);
                    }
                }
                if (quickCopyAddressItemBean.getChainName().length() > 0) {
                    char cCharAt = quickCopyAddressItemBean.getChainName().charAt(i);
                    if (c18303ffp.copydefault(cCharAt)) {
                        char upperCase = java.lang.Character.toUpperCase(cCharAt);
                        java.util.List<QuickCopyAddressItemBean> arrayList2 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase));
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList<>();
                            map.put(java.lang.Character.valueOf(upperCase), arrayList2);
                        }
                        if (c10854bwM.DGgnkA()) {
                            c18303ffp.AEQbTJ(c10854bwM, quickCopyAddressItemBean, arrayList2);
                        } else {
                            c18303ffp.copydefault(c10854bwM, (java.util.List) objectRef.element, quickCopyAddressItemBean, arrayList2);
                        }
                    }
                }
            }
            str = str2;
            i2 = 1;
        }
        java.lang.String str3 = str;
        int i3 = i2;
        pUU.OLrzqt(">>>btc isCustomNetworkSupport:" + AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, i3, null));
        if (AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, i3, null)) {
            for (CustomChainCoinMeta customChainCoinMeta : C10598brV.AEQbTJ.gEmmrt()) {
                QuickCopyAddressItemBean quickCopyAddressItemBean2 = new QuickCopyAddressItemBean(null, 0L, null, null, null, false, null, false, 0, false, false, null, 0, false, null, 32767, null);
                ChainAddress chainAddressOLrzqt = abstractC12782ctV.OLrzqt(java.lang.Long.valueOf(customChainCoinMeta.valueOf()));
                java.lang.String address2 = chainAddressOLrzqt != null ? chainAddressOLrzqt.getAddress() : null;
                if (address2 == null) {
                    address2 = str3;
                }
                quickCopyAddressItemBean2.setAddress(address2);
                quickCopyAddressItemBean2.setCoinId(customChainCoinMeta.valueOf());
                quickCopyAddressItemBean2.setCoinUrl(customChainCoinMeta.fetchVPNInfo());
                quickCopyAddressItemBean2.setChainName(customChainCoinMeta.AhwBna());
                quickCopyAddressItemBean2.setCoinSymbol(customChainCoinMeta.ejfBZ());
                quickCopyAddressItemBean2.setEos(false);
                quickCopyAddressItemBean2.setWalletType(abstractC12782ctV.QwvEab());
                quickCopyAddressItemBean2.setHotNetwork(false);
                quickCopyAddressItemBean2.setHotNetworkRank(0);
                quickCopyAddressItemBean2.setCustom(true);
                c18303ffp.djBIcL.add(quickCopyAddressItemBean2);
                if (quickCopyAddressItemBean2.getChainName().length() > 0) {
                    char cCharAt2 = quickCopyAddressItemBean2.getChainName().charAt(0);
                    if (c18303ffp.copydefault(cCharAt2)) {
                        char upperCase2 = java.lang.Character.toUpperCase(cCharAt2);
                        java.lang.Object arrayList3 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase2));
                        if (arrayList3 == null) {
                            arrayList3 = new java.util.ArrayList();
                            map.put(java.lang.Character.valueOf(upperCase2), arrayList3);
                        }
                        C56532yIw.OLrzqt(arrayList3).add(quickCopyAddressItemBean2);
                    }
                }
            }
        }
        if (c18303ffp.gEmmrt.length() == 0) {
            if (c18303ffp.valueOf()) {
                c18303ffp.AhwBna.clear();
            }
            if (c18303ffp.AhwBna.size() > 0) {
                c18303ffp.AEQbTJ.add("★");
                java.util.List<QuickCopyAddressItemBean> list2 = c18303ffp.AhwBna;
                final Function2 function2 = new Function2() { // from class: o.ffA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return java.lang.Integer.valueOf(C18303ffp.EZpvd((QuickCopyAddressItemBean) obj2, (QuickCopyAddressItemBean) obj3));
                    }
                };
                C56407yEf.copydefault(list2, new java.util.Comparator() { // from class: o.ffz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                        return C18303ffp.EZpvd(function2, obj2, obj3);
                    }
                });
                arrayList.add(new C13784dYd(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikEgkI), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c18303ffp.AhwBna)));
            }
            for (char c = 'A'; c < '['; c = (char) (c + 1)) {
                java.util.List list3 = (java.util.List) map.get(java.lang.Character.valueOf(c));
                if (list3 != null) {
                    if (c18303ffp.valueOf()) {
                        arrayList.add(new C13784dYd(false, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list3)));
                    } else {
                        c18303ffp.AEQbTJ.add(java.lang.String.valueOf(c));
                        arrayList.add(new C13784dYd(true, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list3)));
                    }
                }
            }
            c18303ffp.DbNXlk.postValue(arrayList);
            return c18303ffp.djBIcL;
        }
        java.util.ArrayList<QuickCopyAddressItemBean> arrayList4 = c18303ffp.djBIcL;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList4) {
            if (c18303ffp.EZpvd((QuickCopyAddressItemBean) obj2, c18303ffp.gEmmrt)) {
                arrayList5.add(obj2);
            }
        }
        return arrayList5;
    }

    public static final int EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final int EZpvd(QuickCopyAddressItemBean quickCopyAddressItemBean, QuickCopyAddressItemBean quickCopyAddressItemBean2) {
        if (quickCopyAddressItemBean.getHotNetworkRank() > quickCopyAddressItemBean2.getHotNetworkRank()) {
            return 1;
        }
        return quickCopyAddressItemBean.getHotNetworkRank() == quickCopyAddressItemBean2.getHotNetworkRank() ? 0 : -1;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C18303ffp c18303ffp, java.util.ArrayList arrayList) {
        if (c18303ffp.gEmmrt.length() > 0) {
            c18303ffp.copydefault.setValue(arrayList);
        }
        c18303ffp.valueOf.setValue(java.lang.Boolean.valueOf(c18303ffp.djBIcL.size() + c18303ffp.AhwBna.size() > c18303ffp.KWHzl));
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        pUU.copydefault(message);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<kotlin.Pair<C10854bwM, java.util.List<AddressData>>>> KWHzl(AbstractC12782ctV abstractC12782ctV, java.util.List<C10854bwM> list) {
        java.lang.String address;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final C10854bwM c10854bwM : list) {
            final C8301bAD c8301bAD = new C8301bAD();
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            long jAhwBna = c10854bwM.AhwBna();
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AhwBna(), null, 2, null);
            if (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) {
                address = "";
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = c8301bAD.KWHzl(strDbNXlk, jAhwBna, address);
            final Function1 function1 = new Function1() { // from class: o.ffB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18303ffp.copydefault(c8301bAD, c10854bwM, (AbstractC12782ctV) obj);
                }
            };
            arrayList.add(abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.ffD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C18303ffp.fetchVPNInfo(function1, obj);
                }
            }));
        }
        return C11607cUn.KWHzl(arrayList);
    }

    public static final InterfaceC58261yxu fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final kotlin.Pair DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C8301bAD c8301bAD, final C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58260yxt<java.util.List<AddressData>> abstractC58260yxtEZpvd = c8301bAD.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18303ffp.KWHzl(c10854bwM, (java.util.List) obj);
            }
        };
        return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.ffr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18303ffp.DbNXlk(function1, obj);
            }
        });
    }

    public static final kotlin.Pair KWHzl(C10854bwM c10854bwM, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(c10854bwM, list);
    }

    public final void copydefault(C10854bwM c10854bwM, java.util.List<AddressData> list, QuickCopyAddressItemBean quickCopyAddressItemBean, java.util.List<QuickCopyAddressItemBean> list2) {
        QuickCopyAddressItemBean quickCopyAddressItemBean2;
        java.util.List<QuickCopyAddressItemBean> list3;
        QuickCopyAddressItemBean quickCopyAddressItemBean3;
        java.util.List<QuickCopyAddressItemBean> list4;
        QuickCopyAddressItemBean quickCopyAddressItemBean4 = quickCopyAddressItemBean;
        java.util.List<QuickCopyAddressItemBean> list5 = list2;
        if (!c10854bwM.iRxXKY() || list == null) {
            quickCopyAddressItemBean2 = quickCopyAddressItemBean4;
            list3 = list5;
        } else {
            boolean z = false;
            for (AddressData addressData : list) {
                if (addressData.isSupported()) {
                    QuickCopyAddressItemBean quickCopyAddressItemBeanCopy = quickCopyAddressItemBean.copy((32767 & 1) != 0 ? quickCopyAddressItemBean.address : null, (32767 & 2) != 0 ? quickCopyAddressItemBean.coinId : 0L, (32767 & 4) != 0 ? quickCopyAddressItemBean.chainName : null, (32767 & 8) != 0 ? quickCopyAddressItemBean.coinUrl : null, (32767 & 16) != 0 ? quickCopyAddressItemBean.coinSymbol : null, (32767 & 32) != 0 ? quickCopyAddressItemBean.isEos : false, (32767 & 64) != 0 ? quickCopyAddressItemBean.walletType : null, (32767 & 128) != 0 ? quickCopyAddressItemBean.isHotNetwork : false, (32767 & 256) != 0 ? quickCopyAddressItemBean.hotNetworkRank : 0, (32767 & 512) != 0 ? quickCopyAddressItemBean.isCustom : false, (32767 & 1024) != 0 ? quickCopyAddressItemBean.needGenerateAddress : false, (32767 & 2048) != 0 ? quickCopyAddressItemBean.addressTypeContent : null, (32767 & 4096) != 0 ? quickCopyAddressItemBean.btcAddressType : 0, (32767 & 8192) != 0 ? quickCopyAddressItemBean.isExpanded : false, (32767 & 16384) != 0 ? quickCopyAddressItemBean.moreAddressList : null);
                    quickCopyAddressItemBeanCopy.setAddress(addressData.getAddress());
                    quickCopyAddressItemBeanCopy.setNeedGenerateAddress(addressData.getAddress().length() == 0);
                    quickCopyAddressItemBeanCopy.setBtcAddressType(addressData.getAddressType());
                    quickCopyAddressItemBeanCopy.setAddressTypeContent(addressData.getAddressFormat());
                    list4 = list2;
                    list4.add(quickCopyAddressItemBeanCopy);
                    if (Intrinsics.EZpvd((java.lang.Object) quickCopyAddressItemBean.getAddress(), (java.lang.Object) addressData.getAddress())) {
                        quickCopyAddressItemBean3 = quickCopyAddressItemBean;
                        quickCopyAddressItemBean3.setAddressTypeContent(addressData.getAddressFormat());
                    } else {
                        quickCopyAddressItemBean3 = quickCopyAddressItemBean;
                    }
                    z = true;
                } else {
                    quickCopyAddressItemBean3 = quickCopyAddressItemBean4;
                    list4 = list5;
                }
                list5 = list4;
                quickCopyAddressItemBean4 = quickCopyAddressItemBean3;
            }
            quickCopyAddressItemBean2 = quickCopyAddressItemBean4;
            list3 = list5;
            if (z) {
                return;
            }
        }
        list3.add(quickCopyAddressItemBean2);
    }

    public final void AEQbTJ(C10854bwM c10854bwM, QuickCopyAddressItemBean quickCopyAddressItemBean, java.util.List<QuickCopyAddressItemBean> list) {
        QuickCopyAddressItemBean quickCopyAddressItemBeanCopy = quickCopyAddressItemBean.copy((32767 & 1) != 0 ? quickCopyAddressItemBean.address : null, (32767 & 2) != 0 ? quickCopyAddressItemBean.coinId : 0L, (32767 & 4) != 0 ? quickCopyAddressItemBean.chainName : null, (32767 & 8) != 0 ? quickCopyAddressItemBean.coinUrl : null, (32767 & 16) != 0 ? quickCopyAddressItemBean.coinSymbol : null, (32767 & 32) != 0 ? quickCopyAddressItemBean.isEos : false, (32767 & 64) != 0 ? quickCopyAddressItemBean.walletType : null, (32767 & 128) != 0 ? quickCopyAddressItemBean.isHotNetwork : false, (32767 & 256) != 0 ? quickCopyAddressItemBean.hotNetworkRank : 0, (32767 & 512) != 0 ? quickCopyAddressItemBean.isCustom : false, (32767 & 1024) != 0 ? quickCopyAddressItemBean.needGenerateAddress : false, (32767 & 2048) != 0 ? quickCopyAddressItemBean.addressTypeContent : null, (32767 & 4096) != 0 ? quickCopyAddressItemBean.btcAddressType : 0, (32767 & 8192) != 0 ? quickCopyAddressItemBean.isExpanded : false, (32767 & 16384) != 0 ? quickCopyAddressItemBean.moreAddressList : null);
        if (C17948fYf.copydefault.EZpvd()) {
            quickCopyAddressItemBeanCopy.setAddress(c10854bwM.AEQbTJ(quickCopyAddressItemBean.getAddress()));
            quickCopyAddressItemBeanCopy.setAddressTypeContent(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSupportContentChanged));
            list.add(quickCopyAddressItemBeanCopy);
            quickCopyAddressItemBean.setAddressTypeContent(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSupportActionModeStarted));
            list.add(quickCopyAddressItemBean);
            return;
        }
        quickCopyAddressItemBean.setAddressTypeContent(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSupportActionModeStarted));
        list.add(quickCopyAddressItemBean);
        quickCopyAddressItemBeanCopy.setAddress(c10854bwM.AEQbTJ(quickCopyAddressItemBean.getAddress()));
        quickCopyAddressItemBeanCopy.setAddressTypeContent(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSupportContentChanged));
        list.add(quickCopyAddressItemBeanCopy);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        if (str.length() == 0) {
            this.copydefault.setValue(this.djBIcL);
            return;
        }
        java.util.ArrayList<QuickCopyAddressItemBean> arrayList = this.djBIcL;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (EZpvd((QuickCopyAddressItemBean) obj, str)) {
                arrayList2.add(obj);
            }
        }
        this.copydefault.setValue((java.util.ArrayList<QuickCopyAddressItemBean>) arrayList2);
    }

    public final boolean EZpvd(QuickCopyAddressItemBean quickCopyAddressItemBean, java.lang.String str) {
        return StringsKt__StringsKt.AhwBna((java.lang.CharSequence) quickCopyAddressItemBean.getChainName(), (java.lang.CharSequence) str, true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) quickCopyAddressItemBean.getCoinSymbol(), (java.lang.CharSequence) str, true);
    }

    public final boolean valueOf() {
        return this.djBIcL.size() <= this.KWHzl;
    }

    public final void KWHzl(@NotNull QuickCopyAddressItemBean quickCopyAddressItemBean, boolean z) {
        InterfaceC55105xdf interfaceC55105xdf;
        java.util.List<java.lang.Object> sectionDataList;
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(quickCopyAddressItemBean, "");
        C17948fYf.copydefault.KWHzl(java.lang.String.valueOf(quickCopyAddressItemBean.getCoinId()), z);
        java.util.List<InterfaceC55105xdf> value = this.DbNXlk.getValue();
        java.lang.Object obj = null;
        if (value != null) {
            java.util.Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC55105xdf interfaceC55105xdf2 = (InterfaceC55105xdf) next;
                if (interfaceC55105xdf2 instanceof C13784dYd) {
                    java.util.Iterator<T> it2 = ((C13784dYd) interfaceC55105xdf2).getSectionDataList().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            if (next2 instanceof QuickCopyAddressItemBean) {
                                break;
                            }
                        }
                    }
                    if (next2 != null) {
                        break;
                    }
                }
            }
            interfaceC55105xdf = (InterfaceC55105xdf) next;
        } else {
            interfaceC55105xdf = null;
        }
        C13784dYd c13784dYd = (C13784dYd) interfaceC55105xdf;
        if (c13784dYd != null && (sectionDataList = c13784dYd.getSectionDataList()) != null) {
            java.util.Iterator<T> it3 = sectionDataList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                java.lang.Object next3 = it3.next();
                if (next3 instanceof QuickCopyAddressItemBean) {
                    QuickCopyAddressItemBean quickCopyAddressItemBean2 = (QuickCopyAddressItemBean) next3;
                    if (Intrinsics.EZpvd((java.lang.Object) quickCopyAddressItemBean2.getAddress(), (java.lang.Object) quickCopyAddressItemBean.getAddress()) && quickCopyAddressItemBean2.getCoinId() == quickCopyAddressItemBean.getCoinId()) {
                        obj = next3;
                        break;
                    }
                }
            }
        }
        QuickCopyAddressItemBean quickCopyAddressItemBean3 = (QuickCopyAddressItemBean) obj;
        if (quickCopyAddressItemBean3 != null) {
            quickCopyAddressItemBean3.setExpanded(z);
        }
        this.EZpvd.postValue(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuickCopyAddressItemBean AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull java.util.List<AddressData> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AddressData) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AddressData addressData = (AddressData) it.next();
            arrayList2.add(new QuickCopyAddressItemBean(addressData.getAddress(), c10854bwM.AhwBna(), c10854bwM.djBIcL(), c10854bwM.AYXKKw(), c10854bwM.fJNWhG(), false, abstractC12782ctV.QwvEab(), c10854bwM.hBpjJd(), c10854bwM.ORxRYg(), false, addressData.getAddress().length() == 0, addressData.getAddressFormat(), addressData.getAddressType(), false, null, 25120, null));
        }
        java.lang.Object obj2 = null;
        if (!arrayList2.isEmpty()) {
            java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList2);
            QuickCopyAddressItemBean quickCopyAddressItemBean = (QuickCopyAddressItemBean) objAuCTelauCTel;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList2) {
                if (((QuickCopyAddressItemBean) obj3).getBtcAddressType() != quickCopyAddressItemBean.getBtcAddressType()) {
                    arrayList3.add(obj3);
                }
            }
            quickCopyAddressItemBean.setMoreAddressList(arrayList3);
            if (quickCopyAddressItemBean.getAddress().length() == 0) {
                z = true;
                quickCopyAddressItemBean.setExpanded(!C17948fYf.copydefault.EZpvd(java.lang.String.valueOf(c10854bwM.AhwBna())) || z);
                obj2 = objAuCTelauCTel;
            } else {
                java.util.Iterator<T> it2 = quickCopyAddressItemBean.getMoreAddressList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it2.next();
                    if (((QuickCopyAddressItemBean) next).getAddress().length() == 0) {
                        obj2 = next;
                        break;
                    }
                }
                if (obj2 == null) {
                    z = false;
                }
                if (C17948fYf.copydefault.EZpvd(java.lang.String.valueOf(c10854bwM.AhwBna()))) {
                    quickCopyAddressItemBean.setExpanded(!C17948fYf.copydefault.EZpvd(java.lang.String.valueOf(c10854bwM.AhwBna())) || z);
                    obj2 = objAuCTelauCTel;
                }
            }
        }
        pUU.OLrzqt(">>>btc getBtcAddressGroup:" + obj2);
        return (QuickCopyAddressItemBean) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuickCopyAddressItemBean OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull java.util.List<XLayerAddressData> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (XLayerAddressData xLayerAddressData : list) {
            arrayList.add(new QuickCopyAddressItemBean(xLayerAddressData.getAddress(), c10854bwM.AhwBna(), c10854bwM.djBIcL(), c10854bwM.DbNXlk(), c10854bwM.fJNWhG(), false, abstractC12782ctV.QwvEab(), c10854bwM.hBpjJd(), c10854bwM.ORxRYg(), false, false, xLayerAddressData.getAddressTypeContent(), 0, false, null, 30240, null));
        }
        boolean z2 = true;
        java.lang.Object obj = null;
        if (!arrayList.isEmpty()) {
            java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
            QuickCopyAddressItemBean quickCopyAddressItemBean = (QuickCopyAddressItemBean) objAuCTelauCTel;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((QuickCopyAddressItemBean) obj2).getAddress(), (java.lang.Object) quickCopyAddressItemBean.getAddress())) {
                    arrayList2.add(obj2);
                }
            }
            quickCopyAddressItemBean.setMoreAddressList(arrayList2);
            if (quickCopyAddressItemBean.getAddress().length() == 0) {
                z = true;
                if (!C17948fYf.copydefault.EZpvd(java.lang.String.valueOf(c10854bwM.AhwBna())) && !z) {
                    z2 = false;
                }
                quickCopyAddressItemBean.setExpanded(z2);
                obj = objAuCTelauCTel;
            } else {
                java.util.Iterator<T> it = quickCopyAddressItemBean.getMoreAddressList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((QuickCopyAddressItemBean) next).getAddress().length() == 0) {
                        obj = next;
                        break;
                    }
                }
                if (obj == null) {
                    z = false;
                }
                if (!C17948fYf.copydefault.EZpvd(java.lang.String.valueOf(c10854bwM.AhwBna()))) {
                    z2 = false;
                }
                quickCopyAddressItemBean.setExpanded(z2);
                obj = objAuCTelauCTel;
            }
        }
        pUU.OLrzqt(">>>xlayer getBtcAddressGroup:" + obj);
        return (QuickCopyAddressItemBean) obj;
    }
}
