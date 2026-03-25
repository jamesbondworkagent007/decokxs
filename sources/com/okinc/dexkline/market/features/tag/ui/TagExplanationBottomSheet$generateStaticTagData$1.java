package com.okinc.dexkline.market.features.tag.ui;

import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34496ndF;
import o.C56391yDq;
import o.C56442yFn;
import o.oNP;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class TagExplanationBottomSheet$generateStaticTagData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C34496ndF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagExplanationBottomSheet$generateStaticTagData$1(C34496ndF c34496ndF, Continuation<? super TagExplanationBottomSheet$generateStaticTagData$1> continuation) {
        super(2, continuation);
        this.this$0 = c34496ndF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagExplanationBottomSheet$generateStaticTagData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TagExplanationBottomSheet$generateStaticTagData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C34496ndF c34496ndF;
        List<TagWrapper> list;
        C34496ndF c34496ndF2;
        List<TagWrapper> list2;
        C34496ndF c34496ndF3;
        List<TagWrapper> list3;
        C34496ndF c34496ndF4;
        List<TagWrapper> list4;
        Object objEZpvd;
        C34496ndF c34496ndF5;
        oNP onp;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<TagWrapper> value = this.this$0.AhwBna().valueOf().getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            c34496ndF = this.this$0;
            this.L$0 = value;
            this.L$1 = c34496ndF;
            this.label = 1;
            Object objEZpvd2 = c34496ndF.EZpvd(value, "topHolder", this);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            list = value;
            obj = objEZpvd2;
        } else if (i == 1) {
            c34496ndF = (C34496ndF) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else if (i == 2) {
            c34496ndF2 = (C34496ndF) this.L$1;
            list2 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c34496ndF2.AEQbTJ = (TagWrapper) obj;
            c34496ndF3 = this.this$0;
            this.L$0 = list2;
            this.L$1 = c34496ndF3;
            this.label = 3;
            obj = c34496ndF3.EZpvd(list2, "suspicious", this);
            if (obj != objCopydefault) {
                return objCopydefault;
            }
            list3 = list2;
            c34496ndF3.gEmmrt = (TagWrapper) obj;
            c34496ndF4 = this.this$0;
            this.L$0 = list3;
            this.L$1 = c34496ndF4;
            this.label = 4;
            obj = c34496ndF4.EZpvd(list3, "sniper", this);
            if (obj != objCopydefault) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c34496ndF5 = (C34496ndF) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c34496ndF5.EZpvd = (TagWrapper) obj;
                    onp = this.this$0.KWHzl;
                    if (onp != null && onp.OLrzqt != null) {
                        C34496ndF c34496ndF6 = this.this$0;
                        c34496ndF6.KWHzl(c34496ndF6.isConnected);
                        c34496ndF6.EZpvd(c34496ndF6.gEmmrt);
                        c34496ndF6.AEQbTJ(c34496ndF6.DbNXlk);
                        c34496ndF6.OLrzqt(c34496ndF6.EZpvd);
                    }
                    return Unit.INSTANCE;
                }
                c34496ndF4 = (C34496ndF) this.L$1;
                list4 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c34496ndF4.DbNXlk = (TagWrapper) obj;
                C34496ndF c34496ndF7 = this.this$0;
                this.L$0 = c34496ndF7;
                this.L$1 = null;
                this.label = 5;
                objEZpvd = c34496ndF7.EZpvd(list4, "bundle", this);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                c34496ndF5 = c34496ndF7;
                obj = objEZpvd;
                c34496ndF5.EZpvd = (TagWrapper) obj;
                onp = this.this$0.KWHzl;
                if (onp != null) {
                    C34496ndF c34496ndF62 = this.this$0;
                    c34496ndF62.KWHzl(c34496ndF62.isConnected);
                    c34496ndF62.EZpvd(c34496ndF62.gEmmrt);
                    c34496ndF62.AEQbTJ(c34496ndF62.DbNXlk);
                    c34496ndF62.OLrzqt(c34496ndF62.EZpvd);
                }
                return Unit.INSTANCE;
            }
            c34496ndF3 = (C34496ndF) this.L$1;
            list3 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c34496ndF3.gEmmrt = (TagWrapper) obj;
            c34496ndF4 = this.this$0;
            this.L$0 = list3;
            this.L$1 = c34496ndF4;
            this.label = 4;
            obj = c34496ndF4.EZpvd(list3, "sniper", this);
            if (obj != objCopydefault) {
                return objCopydefault;
            }
            list4 = list3;
            c34496ndF4.DbNXlk = (TagWrapper) obj;
            C34496ndF c34496ndF72 = this.this$0;
            this.L$0 = c34496ndF72;
            this.L$1 = null;
            this.label = 5;
            objEZpvd = c34496ndF72.EZpvd(list4, "bundle", this);
            if (objEZpvd != objCopydefault) {
            }
        }
        c34496ndF.isConnected = (TagWrapper) obj;
        c34496ndF2 = this.this$0;
        this.L$0 = list;
        this.L$1 = c34496ndF2;
        this.label = 2;
        obj = c34496ndF2.EZpvd(list, "dev", this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        list2 = list;
        c34496ndF2.AEQbTJ = (TagWrapper) obj;
        c34496ndF3 = this.this$0;
        this.L$0 = list2;
        this.L$1 = c34496ndF3;
        this.label = 3;
        obj = c34496ndF3.EZpvd(list2, "suspicious", this);
        if (obj != objCopydefault) {
        }
    }
}
