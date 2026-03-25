package com.okinc.business.defi.wallet.mine.backup.viewModel;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.web3.security.model.PrivateKeyInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10598brV;
import o.C10854bwM;
import o.C10954byG;
import o.C13754dXa;
import o.C13855daU;
import o.C14726dqr;
import o.C18807fpQ;
import o.C33070mpX;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yET;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletPrivateKeysViewModel$getDataList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<PrivateKeyInfo>>, Object> {
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C18807fpQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPrivateKeysViewModel$getDataList$2(AbstractC12782ctV abstractC12782ctV, String str, C18807fpQ c18807fpQ, Continuation<? super WalletPrivateKeysViewModel$getDataList$2> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.$password = str;
        this.this$0 = c18807fpQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPrivateKeysViewModel$getDataList$2(this.$wallet, this.$password, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<PrivateKeyInfo>> continuation) {
        return ((WalletPrivateKeysViewModel$getDataList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [23=5] */
    /* JADX DEBUG: Duplicate block (B:51:0x01d7) to fix multi-entry loop: BACK_EDGE: B:51:0x01d7 -> B:52:0x01ef */
    /* JADX DEBUG: Duplicate block (B:65:0x02e5) to fix multi-entry loop: BACK_EDGE: B:65:0x02e5 -> B:66:0x02ea */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:42:0x0175, B:34:0x015c], limit reached: 132 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ed  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, o.daU] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0235 -> B:58:0x023d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        Object objAwait;
        Object objAwait2;
        ArrayList arrayList2;
        List list;
        ArrayList arrayList3;
        Iterator it;
        List<C13855daU> list2;
        String str;
        Ref.ObjectRef objectRef;
        AbstractC12782ctV abstractC12782ctV;
        ArrayList arrayList4;
        C18807fpQ c18807fpQ;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Object next;
        ArrayList arrayList7;
        Iterator it2;
        Ref.ObjectRef objectRef2;
        AbstractC12782ctV abstractC12782ctV2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        C10854bwM c10854bwM;
        Iterator it3;
        ArrayList arrayList10;
        String str2;
        List list3;
        C18807fpQ c18807fpQ2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new ArrayList();
            if (!this.$wallet.AubY() && !this.$wallet.AwvSrB() && !this.$wallet.getFieldNames()) {
                Unit unit = Unit.INSTANCE;
                return arrayList;
            }
            AbstractC58260yxt<List<C13855daU>> abstractC58260yxtValueOf = this.$wallet.valueOf(this.$password);
            this.L$0 = arrayList;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtValueOf, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            arrayList = (ArrayList) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        } else if (i == 2) {
            list = (List) this.L$1;
            arrayList2 = (ArrayList) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait2 = obj;
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            Intrinsics.copydefault(list);
            C18807fpQ c18807fpQ3 = this.this$0;
            AbstractC12782ctV abstractC12782ctV3 = this.$wallet;
            String str3 = this.$password;
            arrayList3 = arrayList2;
            it = list.iterator();
            list2 = (List) objAwait2;
            str = str3;
            objectRef = objectRef3;
            abstractC12782ctV = abstractC12782ctV3;
            arrayList4 = arrayList11;
            c18807fpQ = c18807fpQ3;
            arrayList5 = arrayList12;
            arrayList6 = arrayList13;
            if (it.hasNext()) {
            }
        } else if (i == 3) {
            C10854bwM c10854bwM2 = (C10854bwM) this.L$10;
            Iterator it4 = (Iterator) this.L$9;
            String str4 = (String) this.L$8;
            AbstractC12782ctV abstractC12782ctV4 = (AbstractC12782ctV) this.L$7;
            C18807fpQ c18807fpQ4 = (C18807fpQ) this.L$6;
            ArrayList arrayList14 = (ArrayList) this.L$5;
            ArrayList arrayList15 = (ArrayList) this.L$4;
            ArrayList arrayList16 = (ArrayList) this.L$3;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.L$2;
            List list4 = (List) this.L$1;
            ArrayList arrayList17 = (ArrayList) this.L$0;
            C56391yDq.AEQbTJ(obj);
            List list5 = (List) obj;
            Intrinsics.copydefault(list5);
            arrayList7 = arrayList15;
            it2 = it4;
            objectRef2 = objectRef4;
            abstractC12782ctV2 = abstractC12782ctV4;
            arrayList8 = arrayList17;
            arrayList9 = arrayList14;
            c10854bwM = c10854bwM2;
            it3 = list5.iterator();
            arrayList10 = arrayList16;
            str2 = str4;
            list3 = list4;
            c18807fpQ2 = c18807fpQ4;
            if (!it3.hasNext()) {
            }
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AddressData addressData = (AddressData) this.L$12;
            it3 = (Iterator) this.L$11;
            c10854bwM = (C10854bwM) this.L$10;
            it2 = (Iterator) this.L$9;
            str2 = (String) this.L$8;
            abstractC12782ctV2 = (AbstractC12782ctV) this.L$7;
            C18807fpQ c18807fpQ5 = (C18807fpQ) this.L$6;
            arrayList9 = (ArrayList) this.L$5;
            arrayList7 = (ArrayList) this.L$4;
            ArrayList arrayList18 = (ArrayList) this.L$3;
            objectRef2 = (Ref.ObjectRef) this.L$2;
            list3 = (List) this.L$1;
            arrayList8 = (ArrayList) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C18807fpQ c18807fpQ6 = c18807fpQ5;
            Object objAwait3 = obj;
            String str5 = (String) objAwait3;
            long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
            String strDjBIcL = c10854bwM.djBIcL();
            String strCopydefault = c10854bwM.copydefault();
            String address = addressData.getAddress();
            String addressFormat = addressData.getAddressFormat();
            Intrinsics.copydefault((Object) str5);
            PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo(jFetchVPNInfo, strDjBIcL, strCopydefault, false, null, address, addressFormat, str5, false, C56402yEa.EZpvd(C56443yFo.KWHzl(c10854bwM.fetchVPNInfo())), null, false, false, false, 14336, null);
            if (c10854bwM.AxsJAYaxsJAY()) {
                arrayList7.add(privateKeyInfo);
            } else {
                arrayList9.add(privateKeyInfo);
            }
            c18807fpQ2 = c18807fpQ6;
            arrayList10 = arrayList18;
            if (!it3.hasNext()) {
                AddressData addressData2 = (AddressData) it3.next();
                C18807fpQ c18807fpQ7 = c18807fpQ2;
                AbstractC58260yxt<String> abstractC58260yxtOLrzqt = abstractC12782ctV2.OLrzqt(str2, c10854bwM.AEQbTJ(), addressData2.getAddressType());
                this.L$0 = arrayList8;
                this.L$1 = list3;
                this.L$2 = objectRef2;
                this.L$3 = arrayList10;
                this.L$4 = arrayList7;
                arrayList9 = arrayList9;
                this.L$5 = arrayList9;
                this.L$6 = c18807fpQ7;
                this.L$7 = abstractC12782ctV2;
                this.L$8 = str2;
                this.L$9 = it2;
                this.L$10 = c10854bwM;
                this.L$11 = it3;
                this.L$12 = addressData2;
                ArrayList arrayList19 = arrayList7;
                this.label = 4;
                objAwait3 = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (objAwait3 == objCopydefault) {
                    return objCopydefault;
                }
                arrayList7 = arrayList19;
                arrayList18 = arrayList10;
                addressData = addressData2;
                c18807fpQ6 = c18807fpQ7;
                String str52 = (String) objAwait3;
                long jFetchVPNInfo2 = c10854bwM.fetchVPNInfo();
                String strDjBIcL2 = c10854bwM.djBIcL();
                String strCopydefault2 = c10854bwM.copydefault();
                String address2 = addressData.getAddress();
                String addressFormat2 = addressData.getAddressFormat();
                Intrinsics.copydefault((Object) str52);
                PrivateKeyInfo privateKeyInfo2 = new PrivateKeyInfo(jFetchVPNInfo2, strDjBIcL2, strCopydefault2, false, null, address2, addressFormat2, str52, false, C56402yEa.EZpvd(C56443yFo.KWHzl(c10854bwM.fetchVPNInfo())), null, false, false, false, 14336, null);
                if (c10854bwM.AxsJAYaxsJAY()) {
                }
                c18807fpQ2 = c18807fpQ6;
                arrayList10 = arrayList18;
                if (!it3.hasNext()) {
                    C18807fpQ c18807fpQ8 = c18807fpQ2;
                    Unit unit2 = Unit.INSTANCE;
                    list2 = list3;
                    str = str2;
                    arrayList6 = arrayList9;
                    c18807fpQ = c18807fpQ8;
                    arrayList4 = arrayList10;
                    arrayList3 = arrayList8;
                    abstractC12782ctV = abstractC12782ctV2;
                    objectRef = objectRef2;
                    it = it2;
                    arrayList5 = arrayList7;
                    if (it.hasNext()) {
                        ?? r2 = (C13855daU) it.next();
                        C18807fpQ c18807fpQ9 = c18807fpQ;
                        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(r2.copydefault());
                        if (r2.AEQbTJ().length() != 0 && r2.KWHzl().length() != 0 && c10854bwMKWHzl != null && !c10854bwMKWHzl.RlQdEF()) {
                            if (c10854bwMKWHzl.ejfBZ()) {
                                arrayList4.add(c10854bwMKWHzl);
                                objectRef.element = r2;
                                Unit unit3 = Unit.INSTANCE;
                            } else if (c10854bwMKWHzl.iRxXKY()) {
                                Iterator it5 = it;
                                String str6 = str;
                                c18807fpQ9.copydefault.KWHzl(abstractC12782ctV.DbNXlk(), c10854bwMKWHzl.AhwBna(), r2.KWHzl());
                                AbstractC58260yxt<List<AddressData>> abstractC58260yxtEZpvd = c18807fpQ9.copydefault.EZpvd();
                                this.L$0 = arrayList3;
                                this.L$1 = list2;
                                this.L$2 = objectRef;
                                this.L$3 = arrayList4;
                                this.L$4 = arrayList5;
                                this.L$5 = arrayList6;
                                this.L$6 = c18807fpQ9;
                                this.L$7 = abstractC12782ctV;
                                this.L$8 = str6;
                                this.L$9 = it5;
                                this.L$10 = c10854bwMKWHzl;
                                this.L$11 = null;
                                this.L$12 = null;
                                this.label = 3;
                                Object objAwait4 = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
                                if (objAwait4 == objCopydefault) {
                                    return objCopydefault;
                                }
                                List list6 = (List) objAwait4;
                                Intrinsics.copydefault(list6);
                                arrayList7 = arrayList5;
                                it2 = it5;
                                objectRef2 = objectRef;
                                abstractC12782ctV2 = abstractC12782ctV;
                                arrayList8 = arrayList3;
                                arrayList9 = arrayList6;
                                c10854bwM = c10854bwMKWHzl;
                                it3 = list6.iterator();
                                arrayList10 = arrayList4;
                                str2 = str6;
                                list3 = list2;
                                c18807fpQ2 = c18807fpQ9;
                                if (!it3.hasNext()) {
                                }
                            } else {
                                Iterator it6 = it;
                                C56443yFo.KWHzl(arrayList5.add(new PrivateKeyInfo(c10854bwMKWHzl.fetchVPNInfo(), c10854bwMKWHzl.djBIcL(), c10854bwMKWHzl.copydefault(), false, null, r2.KWHzl(), null, r2.AEQbTJ(), false, C56402yEa.EZpvd(C56443yFo.KWHzl(c10854bwMKWHzl.fetchVPNInfo())), null, false, false, false, 14336, null)));
                                c18807fpQ = c18807fpQ9;
                                it = it6;
                                if (it.hasNext()) {
                                    Intrinsics.copydefault(list2);
                                    for (C13855daU c13855daU : list2) {
                                        if (c13855daU.AEQbTJ().length() != 0 && c13855daU.KWHzl().length() != 0) {
                                            C10598brV c10598brV = C10598brV.AEQbTJ;
                                            CustomChainCoinMeta customChainCoinMetaOLrzqt = c10598brV.OLrzqt(c13855daU.copydefault());
                                            C10854bwM c10854bwMAEQbTJ = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.AEQbTJ() : null;
                                            if (c10854bwMAEQbTJ == null || !c10854bwMAEQbTJ.ejfBZ()) {
                                                ArrayList arrayList20 = new ArrayList();
                                                CustomChainCoinMeta customChainCoinMetaOLrzqt2 = c10598brV.OLrzqt(c13855daU.copydefault());
                                                C10854bwM c10854bwMAEQbTJ2 = customChainCoinMetaOLrzqt2 != null ? customChainCoinMetaOLrzqt2.AEQbTJ() : null;
                                                if (c10854bwMAEQbTJ2 != null) {
                                                    arrayList20.add(c10854bwMAEQbTJ2);
                                                    long jFetchVPNInfo3 = c10854bwMAEQbTJ2.fetchVPNInfo();
                                                    String strDjBIcL3 = c10854bwMAEQbTJ2.djBIcL();
                                                    String strDbNXlk = c10854bwMAEQbTJ2.DbNXlk();
                                                    String strKWHzl = c13855daU.KWHzl();
                                                    String strAEQbTJ = c13855daU.AEQbTJ();
                                                    ArrayList arrayList21 = new ArrayList(C56403yEb.AYXKKw(arrayList20, 10));
                                                    Iterator it7 = arrayList20.iterator();
                                                    while (it7.hasNext()) {
                                                        arrayList21.add(C56443yFo.KWHzl(((C10854bwM) it7.next()).fetchVPNInfo()));
                                                    }
                                                    arrayList5.add(new PrivateKeyInfo(jFetchVPNInfo3, strDjBIcL3, strDbNXlk, false, null, strKWHzl, null, strAEQbTJ, false, arrayList21, null, false, false, false, 14336, null));
                                                }
                                                Unit unit4 = Unit.INSTANCE;
                                            } else {
                                                C56443yFo.KWHzl(arrayList4.add(c10854bwMAEQbTJ));
                                            }
                                        }
                                    }
                                    if (objectRef.element != 0 && (!arrayList4.isEmpty())) {
                                        List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.EZpvd(arrayList4, new ActionBar()), new Application());
                                        Iterator it8 = arrayList4.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it8.next();
                                            if (((C10854bwM) next).OBJEWx()) {
                                                break;
                                            }
                                        }
                                        C10854bwM c10854bwM3 = (C10854bwM) next;
                                        if (c10854bwM3 == null) {
                                            c10854bwM3 = (C10854bwM) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList4);
                                        }
                                        long jFetchVPNInfo4 = c10854bwM3.fetchVPNInfo();
                                        String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatApi24);
                                        String strCopydefault3 = c10854bwM3.copydefault();
                                        String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPlaybackPositionUpdate);
                                        String strKWHzl2 = ((C13855daU) objectRef.element).KWHzl();
                                        String strAEQbTJ2 = ((C13855daU) objectRef.element).AEQbTJ();
                                        ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
                                        Iterator it9 = listEZpvd.iterator();
                                        while (it9.hasNext()) {
                                            arrayList22.add(C56443yFo.KWHzl(((C10854bwM) it9.next()).fetchVPNInfo()));
                                        }
                                        arrayList3.add(new PrivateKeyInfo(jFetchVPNInfo4, strAYXKKw, strCopydefault3, true, strAYXKKw2, strKWHzl2, null, strAEQbTJ2, true, arrayList22, C14726dqr.getChainSquareIconList$default(C14726dqr.OLrzqt, listEZpvd, 0, 2, null), false, false, false, 14336, null));
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        arrayList3.addAll(arrayList6);
                                    }
                                    C56443yFo.KWHzl(arrayList3.addAll(arrayList5));
                                    return arrayList3;
                                }
                            }
                        }
                        c18807fpQ = c18807fpQ9;
                        it = it;
                        if (it.hasNext()) {
                        }
                    }
                }
            }
        }
        List list7 = (List) objAwait;
        AbstractC58260yxt<List<C13855daU>> abstractC58260yxtAhwBna = this.$wallet.AhwBna(this.$password);
        this.L$0 = arrayList;
        this.L$1 = list7;
        this.label = 2;
        objAwait2 = RxAwaitKt.await(abstractC58260yxtAhwBna, this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        arrayList2 = arrayList;
        list = list7;
        Ref.ObjectRef objectRef32 = new Ref.ObjectRef();
        ArrayList arrayList112 = new ArrayList();
        ArrayList arrayList122 = new ArrayList();
        ArrayList arrayList132 = new ArrayList();
        Intrinsics.copydefault(list);
        C18807fpQ c18807fpQ32 = this.this$0;
        AbstractC12782ctV abstractC12782ctV32 = this.$wallet;
        String str32 = this.$password;
        arrayList3 = arrayList2;
        it = list.iterator();
        list2 = (List) objAwait2;
        str = str32;
        objectRef = objectRef32;
        abstractC12782ctV = abstractC12782ctV32;
        arrayList4 = arrayList112;
        c18807fpQ = c18807fpQ32;
        arrayList5 = arrayList122;
        arrayList6 = arrayList132;
        if (it.hasNext()) {
        }
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((C10854bwM) t).ORxRYg()), Integer.valueOf(((C10854bwM) t2).ORxRYg()));
        }
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Boolean.valueOf(!((C10854bwM) t).hBpjJd()), Boolean.valueOf(!((C10854bwM) t2).hBpjJd()));
        }
    }
}
