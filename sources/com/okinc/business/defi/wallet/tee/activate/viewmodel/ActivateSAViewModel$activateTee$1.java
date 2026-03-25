package com.okinc.business.defi.wallet.tee.activate.viewmodel;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.biz.net.bean.AddressVerifyStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.UpdateStatus;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeActivateOperateSuccessState;
import com.okinc.business.defi.wallet.tee.activate.model.TeeActivateSuccess;
import com.okinc.business.defi.wallet.tee.activate.model.TeeCreated;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC12782ctV;
import o.C17833fTz;
import o.C17922fXg;
import o.C33129mqd;
import o.C33488mxR;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fTB;
import o.fTS;
import o.fVJ;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAViewModel$activateTee$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivateTeeModel $activateTeeModel;
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ActivateSAViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAViewModel$activateTee$1(ActivateSAViewModel activateSAViewModel, AbstractC12782ctV abstractC12782ctV, ActivateTeeModel activateTeeModel, String str, Continuation<? super ActivateSAViewModel$activateTee$1> continuation) {
        super(2, continuation);
        this.this$0 = activateSAViewModel;
        this.$wallet = abstractC12782ctV;
        this.$activateTeeModel = activateTeeModel;
        this.$password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ActivateSAViewModel$activateTee$1 activateSAViewModel$activateTee$1 = new ActivateSAViewModel$activateTee$1(this.this$0, this.$wallet, this.$activateTeeModel, this.$password, continuation);
        activateSAViewModel$activateTee$1.L$0 = obj;
        return activateSAViewModel$activateTee$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAViewModel$activateTee$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [182=4] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0367 A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0372 A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03af A[Catch: all -> 0x010c, CancellationException -> 0x0110, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0456 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04be A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04db A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0506 A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0557 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0562 A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05b6 A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211 A[Catch: all -> 0x010c, CancellationException -> 0x0110, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023b A[Catch: all -> 0x010c, CancellationException -> 0x0110, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x0110, all -> 0x010c, blocks: (B:146:0x0488, B:150:0x04ad, B:145:0x047f, B:129:0x0428, B:19:0x0052, B:159:0x0503, B:20:0x0057, B:154:0x04d8, B:23:0x0068, B:119:0x03a9, B:121:0x03af, B:151:0x04be, B:24:0x0077, B:164:0x0526, B:27:0x0094, B:111:0x0361, B:113:0x0367, B:115:0x0372, B:156:0x04db, B:161:0x0506, B:28:0x00a1, B:100:0x032d, B:97:0x02ed, B:96:0x02e2, B:35:0x00bf, B:81:0x0238, B:38:0x00dc, B:76:0x020d, B:78:0x0211, B:83:0x023b, B:102:0x0330, B:104:0x0336, B:107:0x0341, B:39:0x00e4, B:178:0x05b3, B:42:0x00f1, B:173:0x0558, B:175:0x0562, B:46:0x0102, B:170:0x054a, B:47:0x0107, B:183:0x05d5, B:54:0x012c, B:64:0x01c6, B:66:0x01cc, B:68:0x01d4, B:70:0x01de, B:73:0x01f7, B:166:0x0529, B:180:0x05b6, B:61:0x0165), top: B:213:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        AbstractC12782ctV abstractC12782ctV;
        ActivateTeeModel activateTeeModel;
        ActivateSAViewModel activateSAViewModel;
        String str;
        Deferred deferredAsync$default;
        Object objKWHzl;
        Throwable thM7380exceptionOrNullimpl2;
        ViewDataReady viewDataReady;
        ActivateSAViewModel activateSAViewModel2;
        ViewDataReady viewDataReady2;
        Object objAwait;
        Object objOLrzqt;
        ActivateSAViewModel.Application application;
        SingleTeeStatus singleTeeStatus;
        Object objOLrzqt2;
        Object objM7386unboximpl;
        ViewDataReady viewDataReady3;
        ActivateTeeModel activateTeeModel2;
        boolean zBooleanValue;
        Throwable th;
        AbstractC12782ctV abstractC12782ctV2;
        ActivateSAViewModel activateSAViewModel3;
        ActivateSAViewModel$activateTee$1$2$5 activateSAViewModel$activateTee$1$2$5;
        InterfaceC49371unL.Activity activity;
        ActivateSAViewModel activateSAViewModel4;
        Object objM7386unboximpl2;
        Throwable thM7380exceptionOrNullimpl3;
        Throwable thM7380exceptionOrNullimpl4;
        TeeActivateOperateSuccessState teeActivateOperateSuccessState;
        Object objOLrzqt3;
        Throwable th2;
        AbstractC12782ctV abstractC12782ctV3;
        TeeActivateOperateSuccessState teeActivateOperateSuccessState2;
        AbstractC12782ctV abstractC12782ctV4;
        Throwable th3;
        AbstractC12782ctV abstractC12782ctV5;
        Object objAEQbTJ;
        Throwable th4;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th5) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th5));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                ActivateSAViewModel activateSAViewModel5 = this.this$0;
                AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((ActivateSAViewModel.Application) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                    }
                };
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (activateSAViewModel5.KWHzl(anonymousClass1, actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope2 = coroutineScope;
                abstractC12782ctV = this.$wallet;
                activateTeeModel = this.$activateTeeModel;
                activateSAViewModel = this.this$0;
                str = this.$password;
                Result.Application application3 = Result.Companion;
                pUU.copydefault("ActivateSAViewModel", " wallet = " + abstractC12782ctV.DbNXlk() + " : " + abstractC12782ctV.AkhnZx() + ": activateTeeModel = " + C33488mxR.EZpvd(activateTeeModel));
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new ActivateSAViewModel$activateTee$1$2$teeStateDeferred$1(activateSAViewModel, abstractC12782ctV, null), 3, null);
                C17833fTz c17833fTz = activateSAViewModel.KWHzl;
                this.L$0 = coroutineScope2;
                this.L$1 = abstractC12782ctV;
                this.L$2 = activateTeeModel;
                this.L$3 = activateSAViewModel;
                this.L$4 = str;
                this.L$5 = deferredAsync$default;
                this.label = 2;
                objKWHzl = c17833fTz.KWHzl(abstractC12782ctV, true, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl2 != null) {
                    ActivateSAViewModel$activateTee$1$2$viewDataReady$1$1 activateSAViewModel$activateTee$1$2$viewDataReady$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$viewDataReady$1$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((ActivateSAViewModel.Application) obj2).KWHzl();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                        }
                    };
                    InterfaceC49371unL.Application application4 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl2, null, 2, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 3;
                    if (activateSAViewModel.KWHzl(activateSAViewModel$activateTee$1$2$viewDataReady$1$1, application4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                viewDataReady = (ViewDataReady) objKWHzl;
                if (viewDataReady.getWaringInfo() == null && !viewDataReady.getTeeMetaData().isTeeServiceMaintenance() && !C33129mqd.OLrzqt(C56443yFo.AEQbTJ(C17922fXg.EZpvd(viewDataReady.getTeeMetaData())), C56443yFo.AEQbTJ(1))) {
                    this.L$0 = coroutineScope2;
                    this.L$1 = abstractC12782ctV;
                    this.L$2 = activateTeeModel;
                    this.L$3 = activateSAViewModel;
                    this.L$4 = str;
                    this.L$5 = viewDataReady;
                    this.label = 7;
                    objAwait = deferredAsync$default.await(this);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    singleTeeStatus = (SingleTeeStatus) objAwait;
                    if (singleTeeStatus != null) {
                        ActivateSAViewModel$activateTee$1$2$3 activateSAViewModel$activateTee$1$2$3 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$3
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj2) {
                                return ((ActivateSAViewModel.Application) obj2).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj2, Object obj3) {
                                ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                            }
                        };
                        InterfaceC49371unL.Application application5 = new InterfaceC49371unL.Application(TeeGeneratedError.Companion.EZpvd("ActivateSAViewModel : get tee status failed"), null, 2, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 8;
                        if (activateSAViewModel.KWHzl(activateSAViewModel$activateTee$1$2$3, application5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    if (singleTeeStatus.getTeeStatus().isCreated()) {
                        try {
                            Result.Application application6 = Result.Companion;
                            fVJ fvj = activateSAViewModel.valueOf;
                            String strDbNXlk = abstractC12782ctV.DbNXlk();
                            String strEjfBZ = abstractC12782ctV.ejfBZ();
                            AddressVerifyStatus addressVerifyStatus = singleTeeStatus.getAddressVerifyStatus();
                            Boolean boolKWHzl = addressVerifyStatus != null ? C56443yFo.KWHzl(addressVerifyStatus.isVerify()) : null;
                            UpdateStatus updateStatus = new UpdateStatus(C56443yFo.KWHzl(true), C56443yFo.KWHzl(singleTeeStatus.getTeeStatus().isActive()), C56443yFo.KWHzl(singleTeeStatus.getTeeStatus().getExpiredTimestamp()), C56443yFo.KWHzl(singleTeeStatus.getTeeStatus().getUserDisable()), boolKWHzl, singleTeeStatus.getTeeStatus().getAutoRenew(), singleTeeStatus.getTeeStatus().getUpgradeStatus());
                            this.L$0 = abstractC12782ctV;
                            this.L$1 = activateSAViewModel;
                            this.L$2 = singleTeeStatus;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 9;
                            objOLrzqt2 = fvj.OLrzqt(strDbNXlk, strEjfBZ, updateStatus, this);
                            if (objOLrzqt2 == objCopydefault) {
                                return objCopydefault;
                            }
                            pUU.copydefault("ActivateSAViewModel", "teeStatus is Created saveNum = " + ((Number) objOLrzqt2).intValue());
                            Result.m7377constructorimpl(Unit.INSTANCE);
                            break;
                        } catch (Throwable th6) {
                            th = th6;
                            activateSAViewModel3 = activateSAViewModel;
                            abstractC12782ctV2 = abstractC12782ctV;
                            Result.Application application7 = Result.Companion;
                            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            abstractC12782ctV = abstractC12782ctV2;
                            activateSAViewModel = activateSAViewModel3;
                        }
                        activateSAViewModel$activateTee$1$2$5 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$5
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj2) {
                                return ((ActivateSAViewModel.Application) obj2).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj2, Object obj3) {
                                ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                            }
                        };
                        activity = new InterfaceC49371unL.Activity(new TeeCreated(abstractC12782ctV.ejfBZ(), abstractC12782ctV.AkhnZx(), abstractC12782ctV.ejfBZ(), singleTeeStatus.getTeeStatus().isActive(), singleTeeStatus.getTeeStatus().getExpiredTimestamp()));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 10;
                        if (activateSAViewModel.KWHzl(activateSAViewModel$activateTee$1$2$5, activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    AddressVerifyStatus addressVerifyStatus2 = singleTeeStatus.getAddressVerifyStatus();
                    if (addressVerifyStatus2 == null || !addressVerifyStatus2.isVerify()) {
                        fTS fts = activateSAViewModel.AEQbTJ;
                        this.L$0 = coroutineScope2;
                        this.L$1 = abstractC12782ctV;
                        this.L$2 = activateTeeModel;
                        this.L$3 = activateSAViewModel;
                        this.L$4 = str;
                        this.L$5 = viewDataReady;
                        this.label = 11;
                        Object objKWHzl2 = fts.KWHzl(abstractC12782ctV, str, this);
                        if (objKWHzl2 == objCopydefault) {
                            return objCopydefault;
                        }
                        ViewDataReady viewDataReady4 = viewDataReady;
                        objM7386unboximpl = objKWHzl2;
                        viewDataReady3 = viewDataReady4;
                        thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl3 == null) {
                            ActivateSAViewModel$activateTee$1$2$isVerify$isVerify$1$1 activateSAViewModel$activateTee$1$2$isVerify$isVerify$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$isVerify$isVerify$1$1
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj2) {
                                    return ((ActivateSAViewModel.Application) obj2).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj2, Object obj3) {
                                    ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                                }
                            };
                            InterfaceC49371unL.Application application8 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl3, null, 2, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 12;
                            if (activateSAViewModel.KWHzl(activateSAViewModel$activateTee$1$2$isVerify$isVerify$1$1, application8, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                        zBooleanValue = ((Boolean) objM7386unboximpl).booleanValue();
                        viewDataReady = viewDataReady3;
                        activateTeeModel2 = activateTeeModel;
                        if (zBooleanValue) {
                            ActivateSAViewModel$activateTee$1$2$activateTeeResult$2 activateSAViewModel$activateTee$1$2$activateTeeResult$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$activateTeeResult$2
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj2) {
                                    return ((ActivateSAViewModel.Application) obj2).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj2, Object obj3) {
                                    ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                                }
                            };
                            InterfaceC49371unL.Application application9 = new InterfaceC49371unL.Application(TeeGeneratedError.Companion.EZpvd("ActivateSAViewModel : address verify failed"), null, 2, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 15;
                            if (activateSAViewModel.KWHzl(activateSAViewModel$activateTee$1$2$activateTeeResult$2, application9, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                        ActivateTeeModel activateTeeModelCopy = activateTeeModel2.copy((62 & 1) != 0 ? activateTeeModel2.chainIndexList : viewDataReady.getTeeMetaData().getSupportChainIndexList(), (62 & 2) != 0 ? activateTeeModel2.timestamp : 0L, (62 & 4) != 0 ? activateTeeModel2.expireTimestamp : 0L, (62 & 8) != 0 ? activateTeeModel2.autoRenew : false, (62 & 16) != 0 ? activateTeeModel2.teeType : null, (62 & 32) != 0 ? activateTeeModel2.command : null);
                        fTB ftb = activateSAViewModel.EZpvd;
                        this.L$0 = coroutineScope2;
                        this.L$1 = abstractC12782ctV;
                        this.L$2 = activateSAViewModel;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 13;
                        Object objKWHzl3 = ftb.KWHzl(str, activateTeeModelCopy, abstractC12782ctV, this);
                        if (objKWHzl3 == objCopydefault) {
                            return objCopydefault;
                        }
                        activateSAViewModel4 = activateSAViewModel;
                        objM7386unboximpl2 = objKWHzl3;
                        thM7380exceptionOrNullimpl4 = Result.m7380exceptionOrNullimpl(objM7386unboximpl2);
                        if (thM7380exceptionOrNullimpl4 == null) {
                            ActivateSAViewModel$activateTee$1$2$activateTeeResult$1$1 activateSAViewModel$activateTee$1$2$activateTeeResult$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$activateTeeResult$1$1
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj2) {
                                    return ((ActivateSAViewModel.Application) obj2).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj2, Object obj3) {
                                    ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                                }
                            };
                            InterfaceC49371unL.Application application10 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl4, null, 2, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 14;
                            if (activateSAViewModel4.KWHzl(activateSAViewModel$activateTee$1$2$activateTeeResult$1$1, application10, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                        teeActivateOperateSuccessState = (TeeActivateOperateSuccessState) objM7386unboximpl2;
                        try {
                            Result.Application application11 = Result.Companion;
                            fVJ fvj2 = activateSAViewModel4.valueOf;
                            String strDbNXlk2 = abstractC12782ctV.DbNXlk();
                            String strEjfBZ2 = abstractC12782ctV.ejfBZ();
                            UpdateStatus updateStatus2 = new UpdateStatus(C56443yFo.KWHzl(true), C56443yFo.KWHzl(teeActivateOperateSuccessState.isActive()), C56443yFo.KWHzl(teeActivateOperateSuccessState.getExpireTimestamp()), C56443yFo.KWHzl(false), C56443yFo.KWHzl(true), C56443yFo.KWHzl(teeActivateOperateSuccessState.getAutoRenew()), C56443yFo.AEQbTJ(1));
                            this.L$0 = abstractC12782ctV;
                            this.L$1 = activateSAViewModel4;
                            this.L$2 = teeActivateOperateSuccessState;
                            this.label = 16;
                            objOLrzqt3 = fvj2.OLrzqt(strDbNXlk2, strEjfBZ2, updateStatus2, this);
                            if (objOLrzqt3 == objCopydefault) {
                                return objCopydefault;
                            }
                            pUU.copydefault("ActivateSAViewModel", "normal activate saveNum = " + ((Number) objOLrzqt3).intValue());
                            Result.m7377constructorimpl(Unit.INSTANCE);
                            teeActivateOperateSuccessState2 = teeActivateOperateSuccessState;
                            abstractC12782ctV4 = abstractC12782ctV;
                        } catch (Throwable th7) {
                            th2 = th7;
                            abstractC12782ctV3 = abstractC12782ctV;
                            Result.Application application12 = Result.Companion;
                            Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                            teeActivateOperateSuccessState2 = teeActivateOperateSuccessState;
                            abstractC12782ctV4 = abstractC12782ctV3;
                        }
                        try {
                            Result.Application application13 = Result.Companion;
                            fVJ fvj3 = activateSAViewModel4.valueOf;
                            String strDbNXlk3 = abstractC12782ctV4.DbNXlk();
                            String strEjfBZ3 = abstractC12782ctV4.ejfBZ();
                            this.L$0 = abstractC12782ctV4;
                            this.L$1 = teeActivateOperateSuccessState2;
                            this.L$2 = null;
                            this.label = 17;
                            objAEQbTJ = fvj3.AEQbTJ(strDbNXlk3, strEjfBZ3, false, true, this);
                            break;
                        } catch (Throwable th8) {
                            th3 = th8;
                            abstractC12782ctV5 = abstractC12782ctV4;
                            Result.Application application14 = Result.Companion;
                            Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                        }
                        if (objAEQbTJ != objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC12782ctV5 = abstractC12782ctV4;
                        try {
                            pUU.copydefault("ActivateSAViewModel", "final teeStatusUpdate = " + (((SingleTeeStatus) objAEQbTJ) == null));
                            Result.m7377constructorimpl(Unit.INSTANCE);
                            break;
                        } catch (Throwable th9) {
                            th4 = th9;
                            th3 = th4;
                            Result.Application application142 = Result.Companion;
                            Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                        }
                        long expireTimestamp = teeActivateOperateSuccessState2.getExpireTimestamp();
                        long expirePeriodDay = teeActivateOperateSuccessState2.getExpirePeriodDay();
                        boolean autoRenew = teeActivateOperateSuccessState2.getAutoRenew();
                        String teeId = teeActivateOperateSuccessState2.getTeeId();
                        String strDbNXlk4 = abstractC12782ctV5.DbNXlk();
                        String strAkhnZx = abstractC12782ctV5.AkhnZx();
                        String strAEQbTJ = abstractC12782ctV5.AEQbTJ();
                        objM7377constructorimpl = Result.m7377constructorimpl(new TeeActivateSuccess(expireTimestamp, expirePeriodDay, autoRenew, teeId, strDbNXlk4, strAkhnZx, strAEQbTJ == null ? "" : strAEQbTJ, abstractC12782ctV5.KWHzl(true, false)));
                        ActivateSAViewModel activateSAViewModel6 = this.this$0;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            ActivateSAViewModel$activateTee$1$3$1 activateSAViewModel$activateTee$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$3$1
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj2) {
                                    return ((ActivateSAViewModel.Application) obj2).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj2, Object obj3) {
                                    ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                                }
                            };
                            InterfaceC49371unL.Application application15 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 18;
                            if (activateSAViewModel6.KWHzl(activateSAViewModel$activateTee$1$3$1, application15, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        ActivateSAViewModel activateSAViewModel7 = this.this$0;
                        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                            ActivateSAViewModel$activateTee$1$4$1 activateSAViewModel$activateTee$1$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$4$1
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj2) {
                                    return ((ActivateSAViewModel.Application) obj2).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj2, Object obj3) {
                                    ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                                }
                            };
                            InterfaceC49371unL.Activity activity2 = new InterfaceC49371unL.Activity((TeeActivateSuccess) objM7377constructorimpl);
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 19;
                            if (activateSAViewModel7.KWHzl(activateSAViewModel$activateTee$1$4$1, activity2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    activateTeeModel2 = activateTeeModel;
                    zBooleanValue = true;
                    if (zBooleanValue) {
                    }
                }
                ActivateSAViewModel$activateTee$1$2$1 activateSAViewModel$activateTee$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((ActivateSAViewModel.Application) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                    }
                };
                InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                this.L$0 = activateSAViewModel;
                this.L$1 = viewDataReady;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 4;
                if (activateSAViewModel.KWHzl(activateSAViewModel$activateTee$1$2$1, taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
                activateSAViewModel2 = activateSAViewModel;
                viewDataReady2 = viewDataReady;
                this.L$0 = activateSAViewModel2;
                this.L$1 = viewDataReady2;
                this.label = 5;
                objOLrzqt = activateSAViewModel2.OLrzqt(activateSAViewModel2, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                ViewDataReady viewDataReady5 = viewDataReady2;
                application = (ActivateSAViewModel.Application) objOLrzqt;
                if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
                    InterfaceC49371unL<ViewDataChanged> interfaceC49371unLOLrzqt = application.OLrzqt();
                    Intrinsics.copydefault(interfaceC49371unLOLrzqt, "");
                    ViewDataChanged viewDataChangedCopy$default = ViewDataChanged.copy$default((ViewDataChanged) ((InterfaceC49371unL.Activity) interfaceC49371unLOLrzqt).copydefault(), ViewDataReady.copy$default(viewDataReady5, viewDataReady5.getWaringInfo(), false, null, null, viewDataReady5.getTeeMetaData(), 14, null), 0, false, false, false, false, true, 62, null);
                    ActivateSAViewModel$activateTee$1$2$2$1 activateSAViewModel$activateTee$1$2$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$2$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((ActivateSAViewModel.Application) obj2).OLrzqt();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((ActivateSAViewModel.Application) obj2).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj3);
                        }
                    };
                    InterfaceC49371unL.Activity activity3 = new InterfaceC49371unL.Activity(viewDataChangedCopy$default);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    if (activateSAViewModel2.KWHzl(activateSAViewModel$activateTee$1$2$2$1, activity3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope2 = coroutineScope;
                abstractC12782ctV = this.$wallet;
                activateTeeModel = this.$activateTeeModel;
                activateSAViewModel = this.this$0;
                str = this.$password;
                Result.Application application32 = Result.Companion;
                pUU.copydefault("ActivateSAViewModel", " wallet = " + abstractC12782ctV.DbNXlk() + " : " + abstractC12782ctV.AkhnZx() + ": activateTeeModel = " + C33488mxR.EZpvd(activateTeeModel));
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new ActivateSAViewModel$activateTee$1$2$teeStateDeferred$1(activateSAViewModel, abstractC12782ctV, null), 3, null);
                C17833fTz c17833fTz2 = activateSAViewModel.KWHzl;
                this.L$0 = coroutineScope2;
                this.L$1 = abstractC12782ctV;
                this.L$2 = activateTeeModel;
                this.L$3 = activateSAViewModel;
                this.L$4 = str;
                this.L$5 = deferredAsync$default;
                this.label = 2;
                objKWHzl = c17833fTz2.KWHzl(abstractC12782ctV, true, this);
                if (objKWHzl == objCopydefault) {
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                break;
            case 2:
                deferredAsync$default = (Deferred) this.L$5;
                str = (String) this.L$4;
                activateSAViewModel = (ActivateSAViewModel) this.L$3;
                activateTeeModel = (ActivateTeeModel) this.L$2;
                abstractC12782ctV = (AbstractC12782ctV) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
                viewDataReady2 = (ViewDataReady) this.L$1;
                activateSAViewModel2 = (ActivateSAViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = activateSAViewModel2;
                this.L$1 = viewDataReady2;
                this.label = 5;
                objOLrzqt = activateSAViewModel2.OLrzqt(activateSAViewModel2, this);
                if (objOLrzqt == objCopydefault) {
                }
                ViewDataReady viewDataReady52 = viewDataReady2;
                application = (ActivateSAViewModel.Application) objOLrzqt;
                if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
                }
                return Unit.INSTANCE;
            case 5:
                viewDataReady2 = (ViewDataReady) this.L$1;
                activateSAViewModel2 = (ActivateSAViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                ViewDataReady viewDataReady522 = viewDataReady2;
                application = (ActivateSAViewModel.Application) objOLrzqt;
                if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 7:
                ViewDataReady viewDataReady6 = (ViewDataReady) this.L$5;
                str = (String) this.L$4;
                activateSAViewModel = (ActivateSAViewModel) this.L$3;
                activateTeeModel = (ActivateTeeModel) this.L$2;
                abstractC12782ctV = (AbstractC12782ctV) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                viewDataReady = viewDataReady6;
                objAwait = obj;
                singleTeeStatus = (SingleTeeStatus) objAwait;
                if (singleTeeStatus != null) {
                }
                break;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 9:
                singleTeeStatus = (SingleTeeStatus) this.L$2;
                activateSAViewModel3 = (ActivateSAViewModel) this.L$1;
                abstractC12782ctV2 = (AbstractC12782ctV) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    abstractC12782ctV = abstractC12782ctV2;
                    activateSAViewModel = activateSAViewModel3;
                    objOLrzqt2 = obj;
                    pUU.copydefault("ActivateSAViewModel", "teeStatus is Created saveNum = " + ((Number) objOLrzqt2).intValue());
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th10) {
                    th = th10;
                    Result.Application application72 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    abstractC12782ctV = abstractC12782ctV2;
                    activateSAViewModel = activateSAViewModel3;
                }
                activateSAViewModel$activateTee$1$2$5 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$activateTee$1$2$5
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((ActivateSAViewModel.Application) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((ActivateSAViewModel.Application) obj2).EZpvd((InterfaceC49371unL) obj3);
                    }
                };
                activity = new InterfaceC49371unL.Activity(new TeeCreated(abstractC12782ctV.ejfBZ(), abstractC12782ctV.AkhnZx(), abstractC12782ctV.ejfBZ(), singleTeeStatus.getTeeStatus().isActive(), singleTeeStatus.getTeeStatus().getExpiredTimestamp()));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 10;
                if (activateSAViewModel.KWHzl(activateSAViewModel$activateTee$1$2$5, activity, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 10:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 11:
                viewDataReady3 = (ViewDataReady) this.L$5;
                str = (String) this.L$4;
                activateSAViewModel = (ActivateSAViewModel) this.L$3;
                activateTeeModel = (ActivateTeeModel) this.L$2;
                abstractC12782ctV = (AbstractC12782ctV) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl3 == null) {
                }
                break;
            case 12:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 13:
                ActivateSAViewModel activateSAViewModel8 = (ActivateSAViewModel) this.L$2;
                AbstractC12782ctV abstractC12782ctV6 = (AbstractC12782ctV) this.L$1;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                abstractC12782ctV = abstractC12782ctV6;
                activateSAViewModel4 = activateSAViewModel8;
                thM7380exceptionOrNullimpl4 = Result.m7380exceptionOrNullimpl(objM7386unboximpl2);
                if (thM7380exceptionOrNullimpl4 == null) {
                }
                break;
            case 14:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 15:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 16:
                teeActivateOperateSuccessState = (TeeActivateOperateSuccessState) this.L$2;
                activateSAViewModel4 = (ActivateSAViewModel) this.L$1;
                abstractC12782ctV3 = (AbstractC12782ctV) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    abstractC12782ctV = abstractC12782ctV3;
                    objOLrzqt3 = obj;
                    pUU.copydefault("ActivateSAViewModel", "normal activate saveNum = " + ((Number) objOLrzqt3).intValue());
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    teeActivateOperateSuccessState2 = teeActivateOperateSuccessState;
                    abstractC12782ctV4 = abstractC12782ctV;
                } catch (Throwable th11) {
                    th2 = th11;
                    Result.Application application122 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                    teeActivateOperateSuccessState2 = teeActivateOperateSuccessState;
                    abstractC12782ctV4 = abstractC12782ctV3;
                }
                Result.Application application132 = Result.Companion;
                fVJ fvj32 = activateSAViewModel4.valueOf;
                String strDbNXlk32 = abstractC12782ctV4.DbNXlk();
                String strEjfBZ32 = abstractC12782ctV4.ejfBZ();
                this.L$0 = abstractC12782ctV4;
                this.L$1 = teeActivateOperateSuccessState2;
                this.L$2 = null;
                this.label = 17;
                objAEQbTJ = fvj32.AEQbTJ(strDbNXlk32, strEjfBZ32, false, true, this);
                if (objAEQbTJ != objCopydefault) {
                }
                break;
            case 17:
                TeeActivateOperateSuccessState teeActivateOperateSuccessState3 = (TeeActivateOperateSuccessState) this.L$1;
                abstractC12782ctV5 = (AbstractC12782ctV) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    teeActivateOperateSuccessState2 = teeActivateOperateSuccessState3;
                    objAEQbTJ = obj;
                    if (((SingleTeeStatus) objAEQbTJ) == null) {
                    }
                    pUU.copydefault("ActivateSAViewModel", "final teeStatusUpdate = " + (((SingleTeeStatus) objAEQbTJ) == null));
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th12) {
                    th4 = th12;
                    teeActivateOperateSuccessState2 = teeActivateOperateSuccessState3;
                    th3 = th4;
                    Result.Application application1422 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                    long expireTimestamp2 = teeActivateOperateSuccessState2.getExpireTimestamp();
                    long expirePeriodDay2 = teeActivateOperateSuccessState2.getExpirePeriodDay();
                    boolean autoRenew2 = teeActivateOperateSuccessState2.getAutoRenew();
                    String teeId2 = teeActivateOperateSuccessState2.getTeeId();
                    String strDbNXlk42 = abstractC12782ctV5.DbNXlk();
                    String strAkhnZx2 = abstractC12782ctV5.AkhnZx();
                    String strAEQbTJ2 = abstractC12782ctV5.AEQbTJ();
                    objM7377constructorimpl = Result.m7377constructorimpl(new TeeActivateSuccess(expireTimestamp2, expirePeriodDay2, autoRenew2, teeId2, strDbNXlk42, strAkhnZx2, strAEQbTJ2 == null ? "" : strAEQbTJ2, abstractC12782ctV5.KWHzl(true, false)));
                    ActivateSAViewModel activateSAViewModel62 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    ActivateSAViewModel activateSAViewModel72 = this.this$0;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
                long expireTimestamp22 = teeActivateOperateSuccessState2.getExpireTimestamp();
                long expirePeriodDay22 = teeActivateOperateSuccessState2.getExpirePeriodDay();
                boolean autoRenew22 = teeActivateOperateSuccessState2.getAutoRenew();
                String teeId22 = teeActivateOperateSuccessState2.getTeeId();
                String strDbNXlk422 = abstractC12782ctV5.DbNXlk();
                String strAkhnZx22 = abstractC12782ctV5.AkhnZx();
                String strAEQbTJ22 = abstractC12782ctV5.AEQbTJ();
                objM7377constructorimpl = Result.m7377constructorimpl(new TeeActivateSuccess(expireTimestamp22, expirePeriodDay22, autoRenew22, teeId22, strDbNXlk422, strAkhnZx22, strAEQbTJ22 == null ? "" : strAEQbTJ22, abstractC12782ctV5.KWHzl(true, false)));
                ActivateSAViewModel activateSAViewModel622 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                ActivateSAViewModel activateSAViewModel722 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 18:
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                ActivateSAViewModel activateSAViewModel7222 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 19:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
