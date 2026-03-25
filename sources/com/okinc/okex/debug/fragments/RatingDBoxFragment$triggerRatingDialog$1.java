package com.okinc.okex.debug.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import com.okinc.biz.model.ModuleType;
import com.okinc.biz.model.RatingDisplayStatus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C43251rlk;
import o.C45424spY;
import o.C55001xbh;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C6803aWK;
import o.InterfaceC6804aWL;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class RatingDBoxFragment$triggerRatingDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45424spY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDBoxFragment$triggerRatingDialog$1(C45424spY c45424spY, Continuation<? super RatingDBoxFragment$triggerRatingDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = c45424spY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RatingDBoxFragment$triggerRatingDialog$1 ratingDBoxFragment$triggerRatingDialog$1 = new RatingDBoxFragment$triggerRatingDialog$1(this.this$0, continuation);
        ratingDBoxFragment$triggerRatingDialog$1.L$0 = obj;
        return ratingDBoxFragment$triggerRatingDialog$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RatingDBoxFragment$triggerRatingDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:5:0x000b, B:49:0x00aa, B:51:0x00b1, B:52:0x00b6, B:53:0x00c1, B:10:0x0027, B:12:0x0034, B:14:0x003a, B:19:0x0045, B:21:0x004b, B:23:0x0051, B:25:0x0057, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:41:0x007f, B:43:0x0085, B:44:0x0089, B:46:0x0098, B:54:0x00c2, B:55:0x00cd), top: B:66:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:5:0x000b, B:49:0x00aa, B:51:0x00b1, B:52:0x00b6, B:53:0x00c1, B:10:0x0027, B:12:0x0034, B:14:0x003a, B:19:0x0045, B:21:0x004b, B:23:0x0051, B:25:0x0057, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:41:0x007f, B:43:0x0085, B:44:0x0089, B:46:0x0098, B:54:0x00c2, B:55:0x00cd), top: B:66:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:5:0x000b, B:49:0x00aa, B:51:0x00b1, B:52:0x00b6, B:53:0x00c1, B:10:0x0027, B:12:0x0034, B:14:0x003a, B:19:0x0045, B:21:0x004b, B:23:0x0051, B:25:0x0057, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:41:0x007f, B:43:0x0085, B:44:0x0089, B:46:0x0098, B:54:0x00c2, B:55:0x00cd), top: B:66:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String string;
        C55001xbh c55001xbhAEQbTJ;
        String string2;
        C55001xbh c55001xbhEZpvd;
        InterfaceC6804aWL interfaceC6804aWL;
        Object objCopydefault;
        Editable text;
        String string3;
        Editable text2;
        Editable text3;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45424spY c45424spY = this.this$0;
            Result.Application application2 = Result.Companion;
            ModuleType moduleTypeKWHzl = c45424spY.KWHzl();
            C55001xbh c55001xbhAhwBna = c45424spY.AhwBna();
            JsonObject jsonObjectOLrzqt = null;
            if (c55001xbhAhwBna == null || (text3 = c55001xbhAhwBna.getText()) == null) {
                string = null;
                c55001xbhAEQbTJ = c45424spY.AEQbTJ();
                if (c55001xbhAEQbTJ != null || (text2 = c55001xbhAEQbTJ.getText()) == null) {
                    string2 = null;
                    c55001xbhEZpvd = c45424spY.EZpvd();
                    if (c55001xbhEZpvd != null && (text = c55001xbhEZpvd.getText()) != null) {
                        if (!StringsKt__StringsKt.fARcdN(text)) {
                            text = null;
                        }
                        if (text != null && (string3 = text.toString()) != null) {
                            jsonObjectOLrzqt = c45424spY.OLrzqt(string3);
                        }
                    }
                    C6803aWK c6803aWK = new C6803aWK(moduleTypeKWHzl, string, string2, jsonObjectOLrzqt);
                    interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
                    if (interfaceC6804aWL == null) {
                        throw new IllegalArgumentException("Failed to get service".toString());
                    }
                    Context contextRequireContext = c45424spY.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    this.label = 1;
                    objCopydefault = interfaceC6804aWL.copydefault(contextRequireContext, c6803aWK, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                } else {
                    if (!(!StringsKt__StringsKt.fARcdN(text2))) {
                        text2 = null;
                    }
                    if (text2 != null) {
                        string2 = text2.toString();
                    }
                    c55001xbhEZpvd = c45424spY.EZpvd();
                    if (c55001xbhEZpvd != null) {
                        if (!StringsKt__StringsKt.fARcdN(text)) {
                        }
                        if (text != null) {
                            jsonObjectOLrzqt = c45424spY.OLrzqt(string3);
                        }
                    }
                    C6803aWK c6803aWK2 = new C6803aWK(moduleTypeKWHzl, string, string2, jsonObjectOLrzqt);
                    interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
                    if (interfaceC6804aWL == null) {
                    }
                }
            } else {
                if (!(!StringsKt__StringsKt.fARcdN(text3))) {
                    text3 = null;
                }
                if (text3 != null) {
                    string = text3.toString();
                }
                c55001xbhAEQbTJ = c45424spY.AEQbTJ();
                if (c55001xbhAEQbTJ != null) {
                    string2 = null;
                    c55001xbhEZpvd = c45424spY.EZpvd();
                    if (c55001xbhEZpvd != null) {
                    }
                    C6803aWK c6803aWK22 = new C6803aWK(moduleTypeKWHzl, string, string2, jsonObjectOLrzqt);
                    interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
                    if (interfaceC6804aWL == null) {
                    }
                }
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C55326xho.toast$default("Failed to get rating: " + thM7380exceptionOrNullimpl.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
            C45424spY c45424spY2 = this.this$0;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                Intent intent = (Intent) objM7377constructorimpl;
                pUU.OLrzqt("triggerRatingDialog: Rating status: " + intent.getIntExtra(RatingDisplayStatus.RATING_DISPLAY_STATUS, -1));
                c45424spY2.startActivity(intent);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objCopydefault = ((Result) obj).m7386unboximpl();
        C56391yDq.AEQbTJ(objCopydefault);
        Intent intent2 = (Intent) objCopydefault;
        if (intent2 != null) {
            objM7377constructorimpl = Result.m7377constructorimpl(intent2);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            C45424spY c45424spY22 = this.this$0;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Intent was null".toString());
    }
}
