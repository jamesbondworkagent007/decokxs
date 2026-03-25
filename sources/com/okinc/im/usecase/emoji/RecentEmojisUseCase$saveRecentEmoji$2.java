package com.okinc.im.usecase.emoji;

import android.content.SharedPreferences;
import com.okinc.okuser.data.User;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35771oDb;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class RecentEmojisUseCase$saveRecentEmoji$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ String $emoji;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C35771oDb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentEmojisUseCase$saveRecentEmoji$2(C35771oDb c35771oDb, String str, Continuation<? super RecentEmojisUseCase$saveRecentEmoji$2> continuation) {
        super(2, continuation);
        this.this$0 = c35771oDb;
        this.$emoji = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecentEmojisUseCase$saveRecentEmoji$2(this.this$0, this.$emoji, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return ((RecentEmojisUseCase$saveRecentEmoji$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String uid;
        SharedPreferences sharedPreferences;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            User userOLrzqt = C44157sFk.gEmmrt().OLrzqt();
            if (userOLrzqt != null && (uid = userOLrzqt.getUid()) != null) {
                SharedPreferences sharedPreferences2 = this.this$0.KWHzl.getSharedPreferences("recent_emojis_prefs", 0);
                C35771oDb c35771oDb = this.this$0;
                this.L$0 = uid;
                this.L$1 = sharedPreferences2;
                this.label = 1;
                Object objAEQbTJ = c35771oDb.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                sharedPreferences = sharedPreferences2;
                obj = objAEQbTJ;
            } else {
                return yDY.AhwBna();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferences = (SharedPreferences) this.L$1;
            uid = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) obj);
        listFJNWhG.remove(this.$emoji);
        listFJNWhG.add(0, this.$emoji);
        if (listFJNWhG.size() > 7) {
            listFJNWhG.remove(listFJNWhG.size() - 1);
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listFJNWhG, ",", null, null, 0, null, null, 62, null);
        sharedPreferences.edit().putString("recent_emojis_user_" + uid, strJoinToString$default).apply();
        return listFJNWhG;
    }
}
