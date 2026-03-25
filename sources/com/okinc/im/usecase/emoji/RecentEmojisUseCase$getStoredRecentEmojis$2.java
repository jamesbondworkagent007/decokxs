package com.okinc.im.usecase.emoji;

import android.content.SharedPreferences;
import com.okinc.okuser.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35771oDb;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class RecentEmojisUseCase$getStoredRecentEmojis$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    int label;
    final /* synthetic */ C35771oDb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentEmojisUseCase$getStoredRecentEmojis$2(C35771oDb c35771oDb, Continuation<? super RecentEmojisUseCase$getStoredRecentEmojis$2> continuation) {
        super(2, continuation);
        this.this$0 = c35771oDb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecentEmojisUseCase$getStoredRecentEmojis$2(this.this$0, continuation);
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
        return ((RecentEmojisUseCase$getStoredRecentEmojis$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String uid;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            User userOLrzqt = C44157sFk.gEmmrt().OLrzqt();
            if (userOLrzqt != null && (uid = userOLrzqt.getUid()) != null) {
                SharedPreferences sharedPreferences = this.this$0.KWHzl.getSharedPreferences("recent_emojis_prefs", 0);
                String string = sharedPreferences.getString("recent_emojis_user_" + uid, "");
                if (string == null || string.length() == 0) {
                    List listGEmmrt = yDY.gEmmrt("🔥", "🥳", "❤️", "👍", "🙌");
                    String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listGEmmrt, ",", null, null, 0, null, null, 62, null);
                    sharedPreferences.edit().putString("recent_emojis_user_" + uid, strJoinToString$default).apply();
                    return listGEmmrt;
                }
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listSplit$default) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
            return yDY.AhwBna();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
