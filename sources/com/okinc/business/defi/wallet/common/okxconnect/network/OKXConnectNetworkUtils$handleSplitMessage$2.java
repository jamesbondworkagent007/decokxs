package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$handleSplitMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $cipherMessage;
    final /* synthetic */ String $topic;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$handleSplitMessage$2(C16000ebf c16000ebf, String str, String str2, Continuation<? super OKXConnectNetworkUtils$handleSplitMessage$2> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
        this.$cipherMessage = str;
        this.$topic = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKXConnectNetworkUtils$handleSplitMessage$2 oKXConnectNetworkUtils$handleSplitMessage$2 = new OKXConnectNetworkUtils$handleSplitMessage$2(this.this$0, this.$cipherMessage, this.$topic, continuation);
        oKXConnectNetworkUtils$handleSplitMessage$2.L$0 = obj;
        return oKXConnectNetworkUtils$handleSplitMessage$2;
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
        return ((OKXConnectNetworkUtils$handleSplitMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5 A[Catch: all -> 0x0168, TryCatch #0 {all -> 0x0168, blocks: (B:7:0x0026, B:32:0x014d, B:17:0x00a5, B:21:0x00c0, B:25:0x00cd, B:27:0x00eb, B:29:0x0121, B:33:0x0155, B:12:0x004c, B:15:0x0060), top: B:39:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb A[Catch: all -> 0x0168, TryCatch #0 {all -> 0x0168, blocks: (B:7:0x0026, B:32:0x014d, B:17:0x00a5, B:21:0x00c0, B:25:0x00cd, B:27:0x00eb, B:29:0x0121, B:33:0x0155, B:12:0x004c, B:15:0x0060), top: B:39:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121 A[Catch: all -> 0x0168, TryCatch #0 {all -> 0x0168, blocks: (B:7:0x0026, B:32:0x014d, B:17:0x00a5, B:21:0x00c0, B:25:0x00cd, B:27:0x00eb, B:29:0x0121, B:33:0x0155, B:12:0x004c, B:15:0x0060), top: B:39:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155 A[Catch: all -> 0x0168, TRY_LEAVE, TryCatch #0 {all -> 0x0168, blocks: (B:7:0x0026, B:32:0x014d, B:17:0x00a5, B:21:0x00c0, B:25:0x00cd, B:27:0x00eb, B:29:0x0121, B:33:0x0155, B:12:0x004c, B:15:0x0060), top: B:39:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x014a -> B:8:0x0029). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C16000ebf c16000ebf;
        int size;
        int i;
        SplitMessageCache splitMessageCache;
        String str;
        String str2;
        C16000ebf c16000ebf2;
        String str3;
        String str4;
        SplitMessageCache splitMessageCache2;
        int i2;
        Object objOLrzqt;
        int i3;
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            c16000ebf = this.this$0;
            String str5 = this.$cipherMessage;
            String str6 = this.$topic;
            Result.Application application2 = Result.Companion;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            List listAEQbTJ = c16000ebf.AEQbTJ(str5);
            SplitMessageCache splitMessageCache3 = new SplitMessageCache(str6, string, listAEQbTJ.size(), listAEQbTJ, (Set) null, 0L, 48, (DefaultConstructorMarker) null);
            c16000ebf.AuCTel.EZpvd(splitMessageCache3);
            size = listAEQbTJ.size();
            i = 0;
            splitMessageCache = splitMessageCache3;
            str = str6;
            str2 = string;
            if (i < size) {
            }
        } else if (i4 == 1) {
            i3 = this.I$1;
            i2 = this.I$0;
            splitMessageCache2 = (SplitMessageCache) this.L$3;
            str4 = (String) this.L$2;
            str3 = (String) this.L$1;
            c16000ebf2 = (C16000ebf) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            zBooleanValue = ((Boolean) objOLrzqt).booleanValue();
            if (!zBooleanValue) {
            }
            pUU.KWHzl("OKXConnectNetworkUtils", "handleSplitMessage: package" + i2 + " send " + (!zBooleanValue ? "success" : "fail"));
            if (zBooleanValue) {
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.I$1;
            i2 = this.I$0;
            splitMessageCache2 = (SplitMessageCache) this.L$3;
            str4 = (String) this.L$2;
            str3 = (String) this.L$1;
            c16000ebf2 = (C16000ebf) this.L$0;
            C56391yDq.AEQbTJ(obj);
            splitMessageCache = splitMessageCache2;
            str2 = str4;
            str = str3;
            int i5 = i3;
            c16000ebf = c16000ebf2;
            i = i2 + 1;
            size = i5;
            if (i < size) {
                this.L$0 = c16000ebf;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = splitMessageCache;
                this.I$0 = i;
                this.I$1 = size;
                this.label = 1;
                objOLrzqt = c16000ebf.OLrzqt(splitMessageCache, i, (Continuation<? super Boolean>) this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c16000ebf2 = c16000ebf;
                i3 = size;
                i2 = i;
                str4 = str2;
                splitMessageCache2 = splitMessageCache;
                str3 = str;
                zBooleanValue = ((Boolean) objOLrzqt).booleanValue();
                pUU.KWHzl("OKXConnectNetworkUtils", "handleSplitMessage: package" + i2 + " send " + (!zBooleanValue ? "success" : "fail"));
                if (zBooleanValue) {
                    pUU.KWHzl("OKXConnectNetworkUtils", "handleSplitMessage: split package send fail, cancel this send");
                    c16000ebf2.AuCTel.KWHzl(str3, str4);
                    Result.Application application3 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("Failed to send package " + i2 + " after 3 retries"))));
                }
                pUU.EZpvd("OKXConnectNetworkUtils", "delay 10 ms for package " + i2);
                this.L$0 = c16000ebf2;
                this.L$1 = str3;
                this.L$2 = str4;
                this.L$3 = splitMessageCache2;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 2;
                if (DelayKt.delay(10L, this) == objCopydefault) {
                    return objCopydefault;
                }
                splitMessageCache = splitMessageCache2;
                str2 = str4;
                str = str3;
                int i52 = i3;
                c16000ebf = c16000ebf2;
                i = i2 + 1;
                size = i52;
                if (i < size) {
                    pUU.KWHzl("OKXConnectNetworkUtils", "handleSplitMessage: all of the split packages send success");
                    c16000ebf.AuCTel.KWHzl(str, str2);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}
