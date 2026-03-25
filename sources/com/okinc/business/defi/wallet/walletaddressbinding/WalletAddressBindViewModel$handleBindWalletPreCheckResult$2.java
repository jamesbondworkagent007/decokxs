package com.okinc.business.defi.wallet.walletaddressbinding;

import com.okinc.account.api.model.wallet.BindWalletCheckResult;
import com.okinc.account.api.model.wallet.WalletAccount;
import com.okinc.account.api.model.wallet.WalletAccountStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel$handleBindWalletPreCheckResult$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.InterfaceC9739bbK;
import o.gJK;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletAddressBindViewModel$handleBindWalletPreCheckResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $walletId;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletAddressBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBindViewModel$handleBindWalletPreCheckResult$2(WalletAddressBindViewModel walletAddressBindViewModel, String str, Continuation<? super WalletAddressBindViewModel$handleBindWalletPreCheckResult$2> continuation) {
        super(2, continuation);
        this.this$0 = walletAddressBindViewModel;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBindViewModel$handleBindWalletPreCheckResult$2(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((WalletAddressBindViewModel$handleBindWalletPreCheckResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x025f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #2 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:7:0x001f, B:116:0x0260, B:14:0x0032, B:84:0x01a7, B:86:0x01ab, B:89:0x01b6, B:91:0x01ba, B:93:0x01be, B:96:0x01d5, B:17:0x0042, B:53:0x012e, B:54:0x0133, B:55:0x0137, B:57:0x013d, B:61:0x014e, B:63:0x0152, B:64:0x0156, B:66:0x015c, B:70:0x016d, B:72:0x0171, B:73:0x0175, B:75:0x017b, B:79:0x018c, B:81:0x0190, B:100:0x0214, B:102:0x021a, B:104:0x0222, B:107:0x0229, B:108:0x022d, B:110:0x0233, B:113:0x0249, B:20:0x0054, B:37:0x00b7, B:38:0x00c5, B:40:0x00cb, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x0100, B:23:0x0062, B:31:0x008b, B:33:0x0091, B:50:0x0107, B:26:0x006d), top: B:127:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0212  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        WalletAddressBindViewModel walletAddressBindViewModel;
        String str;
        Object objAwait;
        Object objAwait2;
        WalletAddressBindViewModel walletAddressBindViewModel2;
        long j;
        List arrayList;
        List list;
        WalletAddressBindViewModel walletAddressBindViewModel3;
        Iterator it;
        Object next;
        AbstractC12782ctV abstractC12782ctV;
        MutableSharedFlow mutableSharedFlow;
        gJK.Dialog dialog;
        Object objWithContext;
        Object next2;
        Object next3;
        Result result;
        BindWalletCheckResult bindWalletCheckResult;
        Object objCopydefault = C56442yFn.copydefault();
        boolean z = false;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                WalletAddressBindViewModel walletAddressBindViewModel4 = this.this$0;
                String str2 = this.$walletId;
                Result.Application application2 = Result.Companion;
                AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(walletAddressBindViewModel4.valueOf, false, 1, null);
                this.L$0 = walletAddressBindViewModel4;
                this.L$1 = str2;
                this.label = 1;
                if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, this) == objCopydefault) {
                    return objCopydefault;
                }
                walletAddressBindViewModel = walletAddressBindViewModel4;
                str = str2;
                if (str == null) {
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = walletAddressBindViewModel.gEmmrt.OLrzqt(str, false);
                    final Function1 function1 = new Function1() { // from class: o.gJL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return CollectionsKt.KWHzl((AbstractC12782ctV) obj2);
                        }
                    };
                    InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.gJN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj2) {
                            return WalletAddressBindViewModel$handleBindWalletPreCheckResult$2.invokeSuspend$lambda$8$lambda$3(function1, obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(interfaceC58261yxuCopydefault, "");
                    this.L$0 = walletAddressBindViewModel;
                    this.L$1 = str;
                    this.label = 3;
                    objAwait = RxAwaitKt.await(interfaceC58261yxuCopydefault, this);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    arrayList = (List) objAwait;
                    walletAddressBindViewModel3 = walletAddressBindViewModel;
                    list = arrayList;
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    abstractC12782ctV = (AbstractC12782ctV) next;
                    if (abstractC12782ctV == null) {
                    }
                    if (abstractC12782ctV == null) {
                    }
                } else {
                    String strOLrzqt = walletAddressBindViewModel.OLrzqt();
                    if (strOLrzqt != null) {
                        long jValueOf = C33129mqd.valueOf(strOLrzqt);
                        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(walletAddressBindViewModel.gEmmrt, false, false, false, 3, null);
                        this.L$0 = walletAddressBindViewModel;
                        this.L$1 = str;
                        this.J$0 = jValueOf;
                        this.label = 2;
                        objAwait2 = RxAwaitKt.await(abstractC58260yxtFetchAllWallets$default, this);
                        if (objAwait2 == objCopydefault) {
                            return objCopydefault;
                        }
                        walletAddressBindViewModel2 = walletAddressBindViewModel;
                        j = jValueOf;
                        Intrinsics.checkNotNullExpressionValue(objAwait2, "");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : (Iterable) objAwait2) {
                            if (((AbstractC12782ctV) obj2).fZBcTu()) {
                                arrayList2.add(obj2);
                            }
                        }
                        arrayList = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            if (Intrinsics.EZpvd((Object) ((AbstractC12782ctV) obj3).EZpvd(j), (Object) walletAddressBindViewModel2.AEQbTJ())) {
                                arrayList.add(obj3);
                            }
                        }
                        list = arrayList2;
                        walletAddressBindViewModel3 = walletAddressBindViewModel2;
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                            } else {
                                next = it.next();
                                if (((AbstractC12782ctV) next).QwvEab() == WalletType.HDWallet) {
                                }
                            }
                        }
                        abstractC12782ctV = (AbstractC12782ctV) next;
                        if (abstractC12782ctV == null) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    if (((AbstractC12782ctV) next2).QwvEab() == WalletType.KeyWallet) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            abstractC12782ctV = (AbstractC12782ctV) next2;
                            if (abstractC12782ctV == null) {
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next3 = it3.next();
                                        if (((AbstractC12782ctV) next3).QwvEab() == WalletType.TonWallet) {
                                        }
                                    } else {
                                        next3 = null;
                                    }
                                }
                                abstractC12782ctV = (AbstractC12782ctV) next3;
                            }
                        }
                        if (abstractC12782ctV == null) {
                            CoroutineDispatcher coroutineDispatcher = walletAddressBindViewModel3.AhwBna;
                            WalletAddressBindViewModel$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1 walletAddressBindViewModel$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1 = new WalletAddressBindViewModel$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1(walletAddressBindViewModel3, abstractC12782ctV, null);
                            this.L$0 = walletAddressBindViewModel3;
                            this.L$1 = abstractC12782ctV;
                            this.label = 4;
                            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletAddressBindViewModel$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1, this);
                            if (objWithContext == objCopydefault) {
                                return objCopydefault;
                            }
                            result = (Result) objWithContext;
                            if (result == null) {
                                Object objM7386unboximpl = result.m7386unboximpl();
                                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                                    objM7386unboximpl = null;
                                }
                                bindWalletCheckResult = (BindWalletCheckResult) objM7386unboximpl;
                            } else {
                                bindWalletCheckResult = null;
                            }
                            if (!(bindWalletCheckResult instanceof BindWalletCheckResult.AlreadyBound)) {
                                MutableSharedFlow mutableSharedFlow2 = walletAddressBindViewModel3.KWHzl;
                                gJK.PendingIntent pendingIntent = new gJK.PendingIntent(abstractC12782ctV);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 5;
                                if (mutableSharedFlow2.emit(pendingIntent, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                MutableSharedFlow mutableSharedFlow3 = walletAddressBindViewModel3.KWHzl;
                                gJK.Fragment fragment = new gJK.Fragment(new WalletAccount(abstractC12782ctV.DbNXlk(), abstractC12782ctV.AEQbTJ(), abstractC12782ctV.AYXKKw(), null, null, WalletAccountStatus.NOT_BOUND, walletAddressBindViewModel3.AEQbTJ(), null, false, false, null, 1944, null));
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 6;
                                if (mutableSharedFlow3.emit(fragment, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else {
                            if (str != null) {
                                mutableSharedFlow = walletAddressBindViewModel3.KWHzl;
                                dialog = new gJK.Dialog(z);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 7;
                                if (mutableSharedFlow.emit(dialog, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                String strOLrzqt2 = walletAddressBindViewModel3.OLrzqt();
                                if (strOLrzqt2 != null) {
                                    long jValueOf2 = C33129mqd.valueOf(strOLrzqt2);
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        Iterator it4 = list.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!Intrinsics.EZpvd((Object) ((AbstractC12782ctV) it4.next()).EZpvd(jValueOf2), (Object) walletAddressBindViewModel3.AEQbTJ())) {
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                    mutableSharedFlow = walletAddressBindViewModel3.KWHzl;
                                    dialog = new gJK.Dialog(z);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 7;
                                    if (mutableSharedFlow.emit(dialog, this) == objCopydefault) {
                                    }
                                }
                            }
                            return Result.m7376boximpl(objM7377constructorimpl);
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    WalletAddressBindViewModel walletAddressBindViewModel5 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("WalletBindViewModel", "Error fetching bound wallets", thM7380exceptionOrNullimpl);
                        MutableSharedFlow mutableSharedFlow4 = walletAddressBindViewModel5.KWHzl;
                        gJK.Application application3 = new gJK.Application(thM7380exceptionOrNullimpl.getMessage());
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.label = 8;
                        if (mutableSharedFlow4.emit(application3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                break;
            case 1:
                str = (String) this.L$1;
                walletAddressBindViewModel = (WalletAddressBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (str == null) {
                }
                break;
            case 2:
                j = this.J$0;
                str = (String) this.L$1;
                walletAddressBindViewModel2 = (WalletAddressBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                Intrinsics.checkNotNullExpressionValue(objAwait2, "");
                ArrayList arrayList22 = new ArrayList();
                while (r10.hasNext()) {
                }
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                }
                list = arrayList22;
                walletAddressBindViewModel3 = walletAddressBindViewModel2;
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                abstractC12782ctV = (AbstractC12782ctV) next;
                if (abstractC12782ctV == null) {
                }
                if (abstractC12782ctV == null) {
                }
                break;
            case 3:
                str = (String) this.L$1;
                WalletAddressBindViewModel walletAddressBindViewModel6 = (WalletAddressBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                walletAddressBindViewModel = walletAddressBindViewModel6;
                objAwait = obj;
                arrayList = (List) objAwait;
                walletAddressBindViewModel3 = walletAddressBindViewModel;
                list = arrayList;
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                abstractC12782ctV = (AbstractC12782ctV) next;
                if (abstractC12782ctV == null) {
                }
                if (abstractC12782ctV == null) {
                }
                break;
            case 4:
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) this.L$1;
                walletAddressBindViewModel3 = (WalletAddressBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC12782ctV = abstractC12782ctV2;
                objWithContext = obj;
                result = (Result) objWithContext;
                if (result == null) {
                }
                if (!(bindWalletCheckResult instanceof BindWalletCheckResult.AlreadyBound)) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                WalletAddressBindViewModel walletAddressBindViewModel52 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            case 5:
            case 6:
            case 7:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                WalletAddressBindViewModel walletAddressBindViewModel522 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            case 8:
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                return Result.m7376boximpl(objM7377constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$8$lambda$3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }
}
