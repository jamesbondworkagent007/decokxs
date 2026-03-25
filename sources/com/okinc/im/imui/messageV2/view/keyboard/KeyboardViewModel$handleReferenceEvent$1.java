package com.okinc.im.imui.messageV2.view.keyboard;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.model.ReplyResult;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C33729nDr;
import o.C35810oEn;
import o.C35814oEr;
import o.C36560odK;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oCU;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyboardViewModel$handleReferenceEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DraftMessageModel $draftMessageModel;
    final /* synthetic */ C33729nDr $event;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ KeyboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardViewModel$handleReferenceEvent$1(KeyboardViewModel keyboardViewModel, C33729nDr c33729nDr, DraftMessageModel draftMessageModel, Continuation<? super KeyboardViewModel$handleReferenceEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = keyboardViewModel;
        this.$event = c33729nDr;
        this.$draftMessageModel = draftMessageModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KeyboardViewModel$handleReferenceEvent$1 keyboardViewModel$handleReferenceEvent$1 = new KeyboardViewModel$handleReferenceEvent$1(this.this$0, this.$event, this.$draftMessageModel, continuation);
        keyboardViewModel$handleReferenceEvent$1.L$0 = obj;
        return keyboardViewModel$handleReferenceEvent$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardViewModel$handleReferenceEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0012, B:60:0x0176, B:11:0x0026, B:57:0x0158, B:14:0x0037, B:53:0x013b, B:17:0x0048, B:46:0x0116, B:49:0x011c, B:20:0x0061, B:43:0x00f9, B:23:0x007a, B:39:0x00de, B:30:0x00b4, B:32:0x00b8, B:35:0x00c0, B:61:0x017c), top: B:66:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        GroupInfo value;
        KeyboardViewModel keyboardViewModel;
        String str;
        Long l;
        DraftMessageModel draftMessageModel;
        oCU ocu;
        Long l2;
        OKMessage oKMessage;
        OKMessage oKMessage2;
        MutableLiveData mutableLiveData;
        C32989mnw c32989mnw;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                String str2 = (String) this.this$0.values.getValue();
                OKMessage oKMessageEZpvd = this.$event.EZpvd();
                Long lKWHzl = oKMessageEZpvd != null ? C56443yFo.KWHzl(oKMessageEZpvd.getSeq()) : null;
                value = this.this$0.AhwBna().getValue();
                keyboardViewModel = this.this$0;
                DraftMessageModel draftMessageModel2 = this.$draftMessageModel;
                Result.Application application2 = Result.Companion;
                if (str2 != null && !StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
                    C35814oEr c35814oEr = keyboardViewModel.iwGUEr;
                    this.L$0 = str2;
                    this.L$1 = lKWHzl;
                    this.L$2 = value;
                    this.L$3 = keyboardViewModel;
                    this.L$4 = draftMessageModel2;
                    this.label = 1;
                    Object objAEQbTJ = c35814oEr.AEQbTJ(str2, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    str = str2;
                    obj = objAEQbTJ;
                    l = lKWHzl;
                    draftMessageModel = draftMessageModel2;
                    Long l3 = (Long) obj;
                    ocu = keyboardViewModel.QKVWgx;
                    this.L$0 = str;
                    this.L$1 = l;
                    this.L$2 = value;
                    this.L$3 = keyboardViewModel;
                    this.L$4 = l3;
                    this.label = 2;
                    if (ocu.EZpvd(str, draftMessageModel, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    l2 = l3;
                    ReplyResult replyResult = new ReplyResult(str, l2, l);
                    C35810oEn c35810oEn = keyboardViewModel.ejfBZ;
                    this.L$0 = value;
                    this.L$1 = keyboardViewModel;
                    this.L$2 = l2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    obj = c35810oEn.AEQbTJ(str, replyResult, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    oKMessage = (OKMessage) obj;
                    if (oKMessage != null) {
                        if (l2 != null) {
                            MutableLiveData mutableLiveData2 = keyboardViewModel.gEmmrt;
                            C32989mnw c32989mnw2 = new C32989mnw(new StringResource.Raw(null));
                            this.L$0 = value;
                            this.L$1 = keyboardViewModel;
                            this.L$2 = oKMessage;
                            this.label = 4;
                            if (C36588odm.KWHzl(mutableLiveData2, c32989mnw2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        oKMessage2 = oKMessage;
                        mutableLiveData = keyboardViewModel.OLrzqt;
                        c32989mnw = new C32989mnw(Unit.INSTANCE);
                        this.L$0 = value;
                        this.L$1 = keyboardViewModel;
                        this.L$2 = oKMessage2;
                        this.label = 5;
                        if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        if (value != null) {
                            MutableLiveData mutableLiveData3 = keyboardViewModel.valueOf;
                            C32989mnw c32989mnw3 = new C32989mnw(new C36560odK(oKMessage2, value));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            if (C36588odm.KWHzl(mutableLiveData3, c32989mnw3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                pUU.copydefault("handleReferenceEvent", "channelId is null or blank, return");
                return Unit.INSTANCE;
            case 1:
                draftMessageModel = (DraftMessageModel) this.L$4;
                keyboardViewModel = (KeyboardViewModel) this.L$3;
                value = (GroupInfo) this.L$2;
                l = (Long) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Long l32 = (Long) obj;
                ocu = keyboardViewModel.QKVWgx;
                this.L$0 = str;
                this.L$1 = l;
                this.L$2 = value;
                this.L$3 = keyboardViewModel;
                this.L$4 = l32;
                this.label = 2;
                if (ocu.EZpvd(str, draftMessageModel, this) != objCopydefault) {
                }
                break;
            case 2:
                l2 = (Long) this.L$4;
                keyboardViewModel = (KeyboardViewModel) this.L$3;
                value = (GroupInfo) this.L$2;
                l = (Long) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ReplyResult replyResult2 = new ReplyResult(str, l2, l);
                C35810oEn c35810oEn2 = keyboardViewModel.ejfBZ;
                this.L$0 = value;
                this.L$1 = keyboardViewModel;
                this.L$2 = l2;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                obj = c35810oEn2.AEQbTJ(str, replyResult2, this);
                if (obj == objCopydefault) {
                }
                oKMessage = (OKMessage) obj;
                if (oKMessage != null) {
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                l2 = (Long) this.L$2;
                keyboardViewModel = (KeyboardViewModel) this.L$1;
                value = (GroupInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                oKMessage = (OKMessage) obj;
                if (oKMessage != null) {
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 4:
                oKMessage2 = (OKMessage) this.L$2;
                keyboardViewModel = (KeyboardViewModel) this.L$1;
                value = (GroupInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveData = keyboardViewModel.OLrzqt;
                c32989mnw = new C32989mnw(Unit.INSTANCE);
                this.L$0 = value;
                this.L$1 = keyboardViewModel;
                this.L$2 = oKMessage2;
                this.label = 5;
                if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                }
                if (value != null) {
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                oKMessage2 = (OKMessage) this.L$2;
                keyboardViewModel = (KeyboardViewModel) this.L$1;
                value = (GroupInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (value != null) {
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
