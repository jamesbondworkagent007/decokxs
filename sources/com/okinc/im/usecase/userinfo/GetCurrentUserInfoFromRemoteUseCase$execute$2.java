package com.okinc.im.usecase.userinfo;

import com.okinc.okimcore.model.remote.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;
import o.oGL;
import o.oGQ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GetCurrentUserInfoFromRemoteUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserInfo>, Object> {
    final /* synthetic */ boolean $forceReload;
    int I$0;
    boolean Z$0;
    int label;
    final /* synthetic */ oGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrentUserInfoFromRemoteUseCase$execute$2(boolean z, oGL ogl, Continuation<? super GetCurrentUserInfoFromRemoteUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$forceReload = z;
        this.this$0 = ogl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetCurrentUserInfoFromRemoteUseCase$execute$2(this.$forceReload, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserInfo> continuation) {
        return ((GetCurrentUserInfoFromRemoteUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        UserInfo userInfo;
        Object objKWHzl;
        boolean z;
        ?? r0;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$forceReload) {
                InterfaceC44177sGd interfaceC44177sGd = this.this$0.OLrzqt;
                this.I$0 = 1;
                this.label = 1;
                obj = interfaceC44177sGd.KWHzl(false, (Continuation<? super UserInfo>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                i = 1;
                userInfo = (UserInfo) obj;
                r0 = i;
            } else {
                oGQ ogq = this.this$0.KWHzl;
                this.label = 2;
                obj = ogq.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC44177sGd interfaceC44177sGd2 = this.this$0.OLrzqt;
                this.Z$0 = zBooleanValue;
                this.label = 3;
                objKWHzl = interfaceC44177sGd2.KWHzl(true, (Continuation<? super UserInfo>) this);
                if (objKWHzl != objCopydefault) {
                }
            }
        } else if (i2 == 1) {
            int i3 = this.I$0;
            C56391yDq.AEQbTJ(obj);
            i = i3;
            userInfo = (UserInfo) obj;
            r0 = i;
        } else if (i2 == 2) {
            C56391yDq.AEQbTJ(obj);
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            InterfaceC44177sGd interfaceC44177sGd22 = this.this$0.OLrzqt;
            this.Z$0 = zBooleanValue2;
            this.label = 3;
            objKWHzl = interfaceC44177sGd22.KWHzl(true, (Continuation<? super UserInfo>) this);
            if (objKWHzl != objCopydefault) {
                return objCopydefault;
            }
            z = zBooleanValue2;
            obj = objKWHzl;
            userInfo = (UserInfo) obj;
            r0 = z;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z2 = this.Z$0;
            C56391yDq.AEQbTJ(obj);
            z = z2;
            userInfo = (UserInfo) obj;
            r0 = z;
        }
        pUU.KWHzl("GetCurrentUserInfoFromRemoteUseCase", "forceReload:" + this.$forceReload + ", hasLoadFromServer:" + (r0 != 0) + ", currentUser:" + (userInfo != null ? userInfo.getIdentifyId() : null));
        return userInfo;
    }
}
