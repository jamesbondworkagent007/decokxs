package com.okinc.business.defi.wallet.detail;

import android.app.Activity;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC16288ehB;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C13754dXa;
import o.C15274eCg;
import o.C17412fEj;
import o.C17922fXg;
import o.C33064mpR;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.eAZ;
import o.eBX;
import o.rVN;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletDetailActivity$refreshListData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ eAZ this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletDetailActivity$refreshListData$1(eAZ eaz, Continuation<? super DefiWalletDetailActivity$refreshListData$1> continuation) {
        super(2, continuation);
        this.this$0 = eaz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletDetailActivity$refreshListData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletDetailActivity$refreshListData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0242 A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0291 A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029b A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b7 A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122 A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135 A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5 A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230 A[Catch: all -> 0x02d8, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02d8, blocks: (B:7:0x001b, B:92:0x0221, B:95:0x0228, B:97:0x0230, B:98:0x0234, B:99:0x023c, B:101:0x0242, B:103:0x0262, B:106:0x0270, B:105:0x026e, B:107:0x0286, B:109:0x0291, B:110:0x0295, B:112:0x029b, B:114:0x02a3, B:115:0x02a7, B:116:0x02b1, B:118:0x02b7, B:119:0x02bb, B:12:0x0038, B:19:0x0062, B:21:0x0070, B:22:0x0074, B:24:0x0087, B:25:0x008b, B:27:0x009b, B:28:0x009f, B:81:0x01c7, B:83:0x01e7, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:88:0x0212, B:34:0x00b4, B:36:0x00da, B:37:0x00de, B:39:0x00e4, B:41:0x00ea, B:42:0x00ee, B:47:0x00f8, B:49:0x010e, B:50:0x0112, B:52:0x0122, B:55:0x0129, B:57:0x0135, B:58:0x0139, B:60:0x013f, B:62:0x014f, B:63:0x0153, B:64:0x015b, B:66:0x0181, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:72:0x0195, B:77:0x019f, B:79:0x01b5, B:80:0x01b9, B:15:0x0044), top: B:130:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        eAZ eaz;
        Object objAwait;
        eAZ eaz2;
        boolean z;
        AbstractC12784ctX abstractC12784ctX;
        Object objKWHzl;
        ArrayList arrayList;
        eAZ eaz3;
        boolean z2;
        AbstractC12784ctX abstractC12784ctX2;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
        AbstractC12784ctX abstractC12784ctX3;
        AbstractC12784ctX abstractC12784ctX4;
        C17412fEj c17412fEj;
        AbstractC12784ctX abstractC12784ctX5;
        AbstractC16288ehB abstractC16288ehB;
        EIP7702WalletStatus eIP7702WalletStatus;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            eaz = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(eaz.gEmmrt());
            this.L$0 = eaz;
            this.L$1 = eaz;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtDjBIcL, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            eaz2 = eaz;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = (ArrayList) this.L$1;
                eaz3 = (eAZ) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objKWHzl)) {
                    objKWHzl = null;
                }
                Map map = (Map) objKWHzl;
                abstractC12784ctX4 = eaz3.djBIcL;
                if (abstractC12784ctX4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX4 = null;
                }
                for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX4.KWHzl()) {
                    String strDbNXlk = abstractC12782ctV.DbNXlk();
                    String strAEQbTJ = abstractC12782ctV.AEQbTJ();
                    boolean fieldNames = abstractC12782ctV.getFieldNames();
                    String strAkhnZx = abstractC12782ctV.AkhnZx();
                    String strOLrzqt = abstractC12782ctV.OLrzqt("opened");
                    if (map == null || (eIP7702WalletStatus = (EIP7702WalletStatus) map.get(abstractC12782ctV.DbNXlk())) == null) {
                        eIP7702WalletStatus = EIP7702WalletStatus.Unknown;
                    }
                    arrayList.add(new eBX.LoaderManager(strDbNXlk, strAEQbTJ, fieldNames ? 1 : 0, strAkhnZx, strOLrzqt, eIP7702WalletStatus, C17922fXg.OLrzqt(abstractC12782ctV)));
                }
                c17412fEj = new C17412fEj();
                abstractC12784ctX5 = eaz3.djBIcL;
                if (abstractC12784ctX5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX5 = null;
                }
                if (c17412fEj.OLrzqt(abstractC12784ctX5)) {
                    AbstractC12784ctX abstractC12784ctX6 = eaz3.djBIcL;
                    if (abstractC12784ctX6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC12784ctX6 = null;
                    }
                    arrayList.add(new eBX.StateListAnimator(c17412fEj.AEQbTJ(abstractC12784ctX6)));
                }
                abstractC16288ehB = eaz3.KWHzl;
                if (abstractC16288ehB == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16288ehB = null;
                }
                abstractC16288ehB.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onShuffleModeChanged));
                C33064mpR.OLrzqt(eaz3.fIwbmz(), (List<? extends Object>) arrayList);
                rVN.reportFullyDrawn$default((Activity) eaz3, true, (String) null, 2, (Object) null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                eAZ eaz4 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    eaz4.finish();
                }
                return Unit.INSTANCE;
            }
            eaz = (eAZ) this.L$1;
            eAZ eaz5 = (eAZ) this.L$0;
            C56391yDq.AEQbTJ(obj);
            eaz2 = eaz5;
            objAwait = obj;
        }
        eaz.djBIcL = (AbstractC12784ctX) objAwait;
        eaz2.KWHzl();
        AbstractC16288ehB abstractC16288ehB2 = eaz2.KWHzl;
        if (abstractC16288ehB2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16288ehB2 = null;
        }
        abstractC16288ehB2.OLrzqt.setVisibility(0);
        ArrayList arrayList2 = new ArrayList();
        AbstractC12784ctX abstractC12784ctX7 = eaz2.djBIcL;
        if (abstractC12784ctX7 == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX7 = null;
        }
        arrayList2.add(new eBX.Activity(abstractC12784ctX7.AuCTel()));
        AbstractC12784ctX abstractC12784ctX8 = eaz2.djBIcL;
        if (abstractC12784ctX8 == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX8 = null;
        }
        int i2 = ActionBar.EZpvd[abstractC12784ctX8.fJNWhG().ordinal()];
        if (i2 == 1 || i2 == 2) {
            arrayList2.add(new eBX.Application(0, 1, null));
            arrayList2.add(new eBX.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fastForward)));
            int i3 = C52761wXj.TaskDescription.onTransact;
            String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaControllerCallbackStub);
            AbstractC12784ctX abstractC12784ctX9 = eaz2.djBIcL;
            if (abstractC12784ctX9 == null) {
                Intrinsics.gEmmrt("");
                abstractC12784ctX9 = null;
            }
            if (!abstractC12784ctX9.valueOf()) {
                AbstractC12784ctX abstractC12784ctX10 = eaz2.djBIcL;
                if (abstractC12784ctX10 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX10 = null;
                }
                if (abstractC12784ctX10.AkhnZx()) {
                    z = true;
                    arrayList2.add(new eBX.ActionBar(0, i3, strAYXKKw, z));
                    int i4 = C52761wXj.TaskDescription.OmPrLP;
                    String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLaunchPendingIntent);
                    abstractC12784ctX = eaz2.djBIcL;
                    if (abstractC12784ctX == null) {
                    }
                    C56443yFo.KWHzl(arrayList2.add(new eBX.ActionBar(1, i4, strAYXKKw2, abstractC12784ctX.AYXKKw())));
                } else {
                    z = false;
                    arrayList2.add(new eBX.ActionBar(0, i3, strAYXKKw, z));
                    int i42 = C52761wXj.TaskDescription.OmPrLP;
                    String strAYXKKw22 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLaunchPendingIntent);
                    abstractC12784ctX = eaz2.djBIcL;
                    if (abstractC12784ctX == null) {
                    }
                    C56443yFo.KWHzl(arrayList2.add(new eBX.ActionBar(1, i42, strAYXKKw22, abstractC12784ctX.AYXKKw())));
                }
            } else {
                z = true;
                arrayList2.add(new eBX.ActionBar(0, i3, strAYXKKw, z));
                int i422 = C52761wXj.TaskDescription.OmPrLP;
                String strAYXKKw222 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLaunchPendingIntent);
                abstractC12784ctX = eaz2.djBIcL;
                if (abstractC12784ctX == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX = null;
                }
                C56443yFo.KWHzl(arrayList2.add(new eBX.ActionBar(1, i422, strAYXKKw222, abstractC12784ctX.AYXKKw())));
            }
            eAZ eaz42 = this.this$0;
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            }
            return Unit.INSTANCE;
        }
        if (i2 == 3) {
            arrayList2.add(new eBX.Application(0, 1, null));
            arrayList2.add(new eBX.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setContentdefault)));
            int i5 = C52761wXj.TaskDescription.onTransact;
            String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaControllerCallbackStub);
            AbstractC12784ctX abstractC12784ctX11 = eaz2.djBIcL;
            if (abstractC12784ctX11 == null) {
                Intrinsics.gEmmrt("");
                abstractC12784ctX11 = null;
            }
            if (!abstractC12784ctX11.valueOf()) {
                AbstractC12784ctX abstractC12784ctX12 = eaz2.djBIcL;
                if (abstractC12784ctX12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX12 = null;
                }
                if (abstractC12784ctX12.AkhnZx()) {
                    z2 = true;
                    arrayList2.add(new eBX.ActionBar(2, i5, strAYXKKw3, z2));
                    int i6 = C52761wXj.TaskDescription.RTWSvT;
                    String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPackageName);
                    abstractC12784ctX2 = eaz2.djBIcL;
                    if (abstractC12784ctX2 == null) {
                    }
                    mpcWalletEncodeInfoQSBOWP = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX2.KWHzl())).QSBOWP();
                    if (mpcWalletEncodeInfoQSBOWP == null) {
                        String displayAccountName = "";
                        arrayList2.add(new eBX.FragmentManager(i6, strAYXKKw4, displayAccountName));
                        abstractC12784ctX3 = eaz2.djBIcL;
                        if (abstractC12784ctX3 == null) {
                        }
                        if (abstractC12784ctX3.AEQbTJ()) {
                        }
                    }
                } else {
                    z2 = false;
                    arrayList2.add(new eBX.ActionBar(2, i5, strAYXKKw3, z2));
                    int i62 = C52761wXj.TaskDescription.RTWSvT;
                    String strAYXKKw42 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPackageName);
                    abstractC12784ctX2 = eaz2.djBIcL;
                    if (abstractC12784ctX2 == null) {
                    }
                    mpcWalletEncodeInfoQSBOWP = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX2.KWHzl())).QSBOWP();
                    if (mpcWalletEncodeInfoQSBOWP == null) {
                    }
                }
            } else {
                z2 = true;
                arrayList2.add(new eBX.ActionBar(2, i5, strAYXKKw3, z2));
                int i622 = C52761wXj.TaskDescription.RTWSvT;
                String strAYXKKw422 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPackageName);
                abstractC12784ctX2 = eaz2.djBIcL;
                if (abstractC12784ctX2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX2 = null;
                }
                mpcWalletEncodeInfoQSBOWP = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX2.KWHzl())).QSBOWP();
                if (mpcWalletEncodeInfoQSBOWP == null || (displayAccountName = mpcWalletEncodeInfoQSBOWP.getDisplayAccountName()) == null) {
                    String displayAccountName2 = "";
                }
                arrayList2.add(new eBX.FragmentManager(i622, strAYXKKw422, displayAccountName2));
                abstractC12784ctX3 = eaz2.djBIcL;
                if (abstractC12784ctX3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX3 = null;
                }
                if (abstractC12784ctX3.AEQbTJ()) {
                    int i7 = C52761wXj.TaskDescription.zsXlph;
                    String strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getElevation);
                    AbstractC12784ctX abstractC12784ctX13 = eaz2.djBIcL;
                    if (abstractC12784ctX13 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC12784ctX13 = null;
                    }
                    arrayList2.add(new eBX.TaskDescription(i7, strAYXKKw5, abstractC12784ctX13));
                }
            }
            eAZ eaz422 = this.this$0;
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            }
            return Unit.INSTANCE;
        }
        arrayList2.add(new eBX.Application(0, 1, null));
        arrayList2.add(new eBX.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onShuffleModeChangedRemoved)));
        C15274eCg c15274eCg = eaz2.OLrzqt;
        AbstractC12784ctX abstractC12784ctX14 = eaz2.djBIcL;
        if (abstractC12784ctX14 == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX14 = null;
        }
        List<AbstractC12782ctV> listKWHzl = abstractC12784ctX14.KWHzl();
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList3.add(((AbstractC12782ctV) it.next()).DbNXlk());
        }
        this.L$0 = eaz2;
        this.L$1 = arrayList2;
        this.label = 2;
        objKWHzl = c15274eCg.KWHzl(arrayList3, false, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        arrayList = arrayList2;
        eaz3 = eaz2;
        if (Result.m7383isFailureimpl(objKWHzl)) {
        }
        Map map2 = (Map) objKWHzl;
        abstractC12784ctX4 = eaz3.djBIcL;
        if (abstractC12784ctX4 == null) {
        }
        while (r8.hasNext()) {
        }
        c17412fEj = new C17412fEj();
        abstractC12784ctX5 = eaz3.djBIcL;
        if (abstractC12784ctX5 == null) {
        }
        if (c17412fEj.OLrzqt(abstractC12784ctX5)) {
        }
        abstractC16288ehB = eaz3.KWHzl;
        if (abstractC16288ehB == null) {
        }
        abstractC16288ehB.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onShuffleModeChanged));
        C33064mpR.OLrzqt(eaz3.fIwbmz(), (List<? extends Object>) arrayList);
        rVN.reportFullyDrawn$default((Activity) eaz3, true, (String) null, 2, (Object) null);
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        eAZ eaz4222 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
