package com.okinc.business.defi.wallet.mine.addressbook.detail.manager;

import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressChainUiData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C13853daS;
import o.C18715fnd;
import o.C18733fnv;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressBookChainsFromAddressManagerImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends AddressChainUiData>, ? extends Unit>>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ long $apiLoadingDelayMillis;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onApiCallLoading;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ C18733fnv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressBookChainsFromAddressManagerImpl$invoke$2(C18733fnv c18733fnv, String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1, long j, Continuation<? super AddressBookChainsFromAddressManagerImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c18733fnv;
        this.$address = str;
        this.$onApiCallLoading = function1;
        this.$apiLoadingDelayMillis = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddressBookChainsFromAddressManagerImpl$invoke$2 addressBookChainsFromAddressManagerImpl$invoke$2 = new AddressBookChainsFromAddressManagerImpl$invoke$2(this.this$0, this.$address, this.$onApiCallLoading, this.$apiLoadingDelayMillis, continuation);
        addressBookChainsFromAddressManagerImpl$invoke$2.L$0 = obj;
        return addressBookChainsFromAddressManagerImpl$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends AddressChainUiData>, ? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<AddressChainUiData>, Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<AddressChainUiData>, Unit>> continuation) {
        return ((AddressBookChainsFromAddressManagerImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0115 A[LOOP:2: B:18:0x010f->B:20:0x0115, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0293 A[LOOP:0: B:56:0x028d->B:58:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        List arrayList;
        Object objWithContext;
        Iterator it;
        C18733fnv c18733fnv;
        String str;
        Function1<Continuation<? super Unit>, Object> function1;
        long j;
        List listOLrzqt;
        Deferred deferredCompletableDeferred;
        List list;
        List list2;
        List list3;
        CoroutineScope coroutineScope2;
        List list4;
        C18733fnv c18733fnv2;
        long j2;
        String str2;
        Function1<Continuation<? super Unit>, Object> function12;
        List list5;
        List list6;
        Deferred deferredCompletableDeferred2;
        List list7;
        CoroutineScope coroutineScope3;
        List list8;
        List list9;
        C18733fnv c18733fnv3;
        String str3;
        CoroutineScope coroutineScope4;
        Object objAwaitAll;
        List list10;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        Object objWithContext2;
        AbstractC43419rot abstractC43419rot3;
        C10854bwM c10854bwM;
        Iterator it2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                arrayList = new ArrayList();
                CoroutineDispatcher coroutineDispatcher = this.this$0.KWHzl;
                AddressBookChainsFromAddressManagerImpl$invoke$2$compatibleChains$1 addressBookChainsFromAddressManagerImpl$invoke$2$compatibleChains$1 = new AddressBookChainsFromAddressManagerImpl$invoke$2$compatibleChains$1(this.$address, null);
                this.L$0 = coroutineScope;
                this.L$1 = arrayList;
                this.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, addressBookChainsFromAddressManagerImpl$invoke$2$compatibleChains$1, this);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                List list11 = (List) objWithContext;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list11, 10));
                it = list11.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C18715fnd.toAddressChainUiData$default(((C13853daS) it.next()).copydefault(), false, 1, null));
                }
                arrayList.addAll(arrayList2);
                c18733fnv = this.this$0;
                str = this.$address;
                function1 = this.$onApiCallLoading;
                j = this.$apiLoadingDelayMillis;
                listOLrzqt = C56402yEa.OLrzqt();
                if (!c18733fnv.KWHzl(str)) {
                    this.L$0 = coroutineScope;
                    this.L$1 = arrayList;
                    this.L$2 = c18733fnv;
                    this.L$3 = str;
                    this.L$4 = function1;
                    this.L$5 = listOLrzqt;
                    this.L$6 = listOLrzqt;
                    this.L$7 = listOLrzqt;
                    this.J$0 = j;
                    this.label = 2;
                    if (function1.invoke(this) == objCopydefault) {
                        return objCopydefault;
                    }
                    list3 = arrayList;
                    coroutineScope2 = coroutineScope;
                    list4 = listOLrzqt;
                    c18733fnv2 = c18733fnv;
                    j2 = j;
                    str2 = str;
                    function12 = function1;
                    list5 = list4;
                    list6 = list5;
                    this.L$0 = coroutineScope2;
                    this.L$1 = list3;
                    this.L$2 = c18733fnv2;
                    this.L$3 = str2;
                    this.L$4 = function12;
                    this.L$5 = list6;
                    this.L$6 = list5;
                    this.L$7 = list4;
                    this.J$0 = j2;
                    this.label = 3;
                    if (DelayKt.delay(j2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    deferredCompletableDeferred = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$1(c18733fnv2, str2, null), 3, null);
                    C18733fnv c18733fnv4 = c18733fnv2;
                    listOLrzqt = list4;
                    arrayList = list3;
                    list = list6;
                    function1 = function12;
                    CoroutineScope coroutineScope5 = coroutineScope2;
                    list2 = list5;
                    str = str2;
                    j = j2;
                    c18733fnv = c18733fnv4;
                    coroutineScope = coroutineScope5;
                    listOLrzqt.add(deferredCompletableDeferred);
                    if (!c18733fnv.AEQbTJ(str)) {
                        this.L$0 = coroutineScope;
                        this.L$1 = arrayList;
                        this.L$2 = c18733fnv;
                        this.L$3 = str;
                        this.L$4 = list;
                        this.L$5 = list2;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.J$0 = j;
                        this.label = 4;
                        if (function1.invoke(this) == objCopydefault) {
                            return objCopydefault;
                        }
                        list7 = arrayList;
                        coroutineScope3 = coroutineScope;
                        list8 = list;
                        list9 = list2;
                        String str4 = str;
                        c18733fnv3 = c18733fnv;
                        str3 = str4;
                        this.L$0 = coroutineScope3;
                        this.L$1 = list7;
                        this.L$2 = c18733fnv3;
                        this.L$3 = str3;
                        this.L$4 = list8;
                        this.L$5 = list9;
                        this.label = 5;
                        if (DelayKt.delay(j, this) != objCopydefault) {
                            return objCopydefault;
                        }
                        coroutineScope4 = coroutineScope3;
                        deferredCompletableDeferred2 = BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$2(c18733fnv3, str3, null), 3, null);
                        list2 = list9;
                        list = list8;
                        arrayList = list7;
                        list2.add(deferredCompletableDeferred2);
                        List listFARcdN = C56402yEa.fARcdN(list);
                        this.L$0 = arrayList;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.label = 6;
                        objAwaitAll = AwaitKt.awaitAll(listFARcdN, this);
                        if (objAwaitAll == objCopydefault) {
                            return objCopydefault;
                        }
                        list10 = arrayList;
                        List list12 = (List) objAwaitAll;
                        abstractC43419rot = (AbstractC43419rot) list12.get(0);
                        abstractC43419rot2 = (AbstractC43419rot) list12.get(1);
                        if (abstractC43419rot.EZpvd() && Intrinsics.EZpvd(abstractC43419rot.copydefault(), C56443yFo.KWHzl(true))) {
                            CoroutineDispatcher coroutineDispatcher2 = this.this$0.KWHzl;
                            AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1 addressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1 = new AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1(this.$address, null);
                            this.L$0 = list10;
                            this.L$1 = abstractC43419rot;
                            this.L$2 = abstractC43419rot2;
                            this.label = 7;
                            objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, addressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1, this);
                            if (objWithContext2 != objCopydefault) {
                                return objCopydefault;
                            }
                            abstractC43419rot3 = abstractC43419rot2;
                            List list13 = (List) objWithContext2;
                            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list13, 10));
                            it2 = list13.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(C18715fnd.toAddressChainUiData$default(((C13853daS) it2.next()).copydefault(), false, 1, null));
                            }
                            list10.addAll(arrayList3);
                            abstractC43419rot2 = abstractC43419rot3;
                        }
                        if (abstractC43419rot2.EZpvd() && Intrinsics.EZpvd(abstractC43419rot2.copydefault(), C56443yFo.KWHzl(true)) && (c10854bwM = this.this$0.OLrzqt) != null) {
                            C56443yFo.KWHzl(list10.add(C18715fnd.toAddressChainUiData$default(c10854bwM, false, 1, null)));
                        }
                        if (abstractC43419rot.OLrzqt() | abstractC43419rot2.OLrzqt()) {
                            return new AbstractC43419rot.ActionBar(Unit.INSTANCE);
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : list10) {
                            if (hashSet.add(C56443yFo.KWHzl(((AddressChainUiData) obj2).OLrzqt()))) {
                                arrayList4.add(obj2);
                            }
                        }
                        return new AbstractC43419rot.StateListAnimator(arrayList4);
                    }
                    deferredCompletableDeferred2 = CompletableDeferredKt.CompletableDeferred(new AbstractC43419rot.StateListAnimator(C56443yFo.KWHzl(false)));
                    list2.add(deferredCompletableDeferred2);
                    List listFARcdN2 = C56402yEa.fARcdN(list);
                    this.L$0 = arrayList;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 6;
                    objAwaitAll = AwaitKt.awaitAll(listFARcdN2, this);
                    if (objAwaitAll == objCopydefault) {
                    }
                    list10 = arrayList;
                    List list122 = (List) objAwaitAll;
                    abstractC43419rot = (AbstractC43419rot) list122.get(0);
                    abstractC43419rot2 = (AbstractC43419rot) list122.get(1);
                    if (abstractC43419rot.EZpvd()) {
                        CoroutineDispatcher coroutineDispatcher22 = this.this$0.KWHzl;
                        AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1 addressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$12 = new AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1(this.$address, null);
                        this.L$0 = list10;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = abstractC43419rot2;
                        this.label = 7;
                        objWithContext2 = BuildersKt.withContext(coroutineDispatcher22, addressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$12, this);
                        if (objWithContext2 != objCopydefault) {
                        }
                    }
                    if (abstractC43419rot2.EZpvd()) {
                        C56443yFo.KWHzl(list10.add(C18715fnd.toAddressChainUiData$default(c10854bwM, false, 1, null)));
                    }
                    if (abstractC43419rot.OLrzqt() | abstractC43419rot2.OLrzqt()) {
                    }
                } else {
                    deferredCompletableDeferred = CompletableDeferredKt.CompletableDeferred(new AbstractC43419rot.StateListAnimator(C56443yFo.KWHzl(false)));
                    list = listOLrzqt;
                    list2 = list;
                    listOLrzqt.add(deferredCompletableDeferred);
                    if (!c18733fnv.AEQbTJ(str)) {
                    }
                }
                break;
            case 1:
                arrayList = (List) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objWithContext = obj;
                List list112 = (List) objWithContext;
                ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(list112, 10));
                it = list112.iterator();
                while (it.hasNext()) {
                }
                arrayList.addAll(arrayList22);
                c18733fnv = this.this$0;
                str = this.$address;
                function1 = this.$onApiCallLoading;
                j = this.$apiLoadingDelayMillis;
                listOLrzqt = C56402yEa.OLrzqt();
                if (!c18733fnv.KWHzl(str)) {
                }
                break;
            case 2:
                j2 = this.J$0;
                list4 = (List) this.L$7;
                list5 = (List) this.L$6;
                list6 = (List) this.L$5;
                function12 = (Function1) this.L$4;
                str2 = (String) this.L$3;
                c18733fnv2 = (C18733fnv) this.L$2;
                list3 = (List) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = coroutineScope2;
                this.L$1 = list3;
                this.L$2 = c18733fnv2;
                this.L$3 = str2;
                this.L$4 = function12;
                this.L$5 = list6;
                this.L$6 = list5;
                this.L$7 = list4;
                this.J$0 = j2;
                this.label = 3;
                if (DelayKt.delay(j2, this) == objCopydefault) {
                }
                deferredCompletableDeferred = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$1(c18733fnv2, str2, null), 3, null);
                C18733fnv c18733fnv42 = c18733fnv2;
                listOLrzqt = list4;
                arrayList = list3;
                list = list6;
                function1 = function12;
                CoroutineScope coroutineScope52 = coroutineScope2;
                list2 = list5;
                str = str2;
                j = j2;
                c18733fnv = c18733fnv42;
                coroutineScope = coroutineScope52;
                listOLrzqt.add(deferredCompletableDeferred);
                if (!c18733fnv.AEQbTJ(str)) {
                }
                break;
            case 3:
                j2 = this.J$0;
                list4 = (List) this.L$7;
                list5 = (List) this.L$6;
                list6 = (List) this.L$5;
                function12 = (Function1) this.L$4;
                str2 = (String) this.L$3;
                c18733fnv2 = (C18733fnv) this.L$2;
                list3 = (List) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferredCompletableDeferred = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$1(c18733fnv2, str2, null), 3, null);
                C18733fnv c18733fnv422 = c18733fnv2;
                listOLrzqt = list4;
                arrayList = list3;
                list = list6;
                function1 = function12;
                CoroutineScope coroutineScope522 = coroutineScope2;
                list2 = list5;
                str = str2;
                j = j2;
                c18733fnv = c18733fnv422;
                coroutineScope = coroutineScope522;
                listOLrzqt.add(deferredCompletableDeferred);
                if (!c18733fnv.AEQbTJ(str)) {
                }
                break;
            case 4:
                long j3 = this.J$0;
                list9 = (List) this.L$5;
                List list14 = (List) this.L$4;
                String str5 = (String) this.L$3;
                C18733fnv c18733fnv5 = (C18733fnv) this.L$2;
                List list15 = (List) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list8 = list14;
                str3 = str5;
                c18733fnv3 = c18733fnv5;
                list7 = list15;
                j = j3;
                this.L$0 = coroutineScope3;
                this.L$1 = list7;
                this.L$2 = c18733fnv3;
                this.L$3 = str3;
                this.L$4 = list8;
                this.L$5 = list9;
                this.label = 5;
                if (DelayKt.delay(j, this) != objCopydefault) {
                }
                break;
            case 5:
                list9 = (List) this.L$5;
                list8 = (List) this.L$4;
                str3 = (String) this.L$3;
                c18733fnv3 = (C18733fnv) this.L$2;
                list7 = (List) this.L$1;
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope4 = coroutineScope6;
                deferredCompletableDeferred2 = BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$2(c18733fnv3, str3, null), 3, null);
                list2 = list9;
                list = list8;
                arrayList = list7;
                list2.add(deferredCompletableDeferred2);
                List listFARcdN22 = C56402yEa.fARcdN(list);
                this.L$0 = arrayList;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 6;
                objAwaitAll = AwaitKt.awaitAll(listFARcdN22, this);
                if (objAwaitAll == objCopydefault) {
                }
                list10 = arrayList;
                List list1222 = (List) objAwaitAll;
                abstractC43419rot = (AbstractC43419rot) list1222.get(0);
                abstractC43419rot2 = (AbstractC43419rot) list1222.get(1);
                if (abstractC43419rot.EZpvd()) {
                }
                if (abstractC43419rot2.EZpvd()) {
                }
                if (abstractC43419rot.OLrzqt() | abstractC43419rot2.OLrzqt()) {
                }
                break;
            case 6:
                arrayList = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwaitAll = obj;
                list10 = arrayList;
                List list12222 = (List) objAwaitAll;
                abstractC43419rot = (AbstractC43419rot) list12222.get(0);
                abstractC43419rot2 = (AbstractC43419rot) list12222.get(1);
                if (abstractC43419rot.EZpvd()) {
                }
                if (abstractC43419rot2.EZpvd()) {
                }
                if (abstractC43419rot.OLrzqt() | abstractC43419rot2.OLrzqt()) {
                }
                break;
            case 7:
                abstractC43419rot3 = (AbstractC43419rot) this.L$2;
                abstractC43419rot = (AbstractC43419rot) this.L$1;
                list10 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objWithContext2 = obj;
                List list132 = (List) objWithContext2;
                ArrayList arrayList32 = new ArrayList(C56403yEb.AYXKKw(list132, 10));
                it2 = list132.iterator();
                while (it2.hasNext()) {
                }
                list10.addAll(arrayList32);
                abstractC43419rot2 = abstractC43419rot3;
                if (abstractC43419rot2.EZpvd()) {
                }
                if (abstractC43419rot.OLrzqt() | abstractC43419rot2.OLrzqt()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
