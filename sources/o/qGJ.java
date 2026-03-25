package o;

import com.okinc.im.bean.SearchResultData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGJ implements InterfaceC49405unt<java.util.List<? extends qGF>, C40001qFr> {
    @yCM
    public qGJ() {
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    public C40001qFr EZpvd(@NotNull java.util.List<qGF> list) {
        Intrinsics.checkNotNullParameter(list, "");
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((C40001qFr) InterfaceC49405unt.Activity.EZpvd(this, list), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis()));
        C40375qTn.AEQbTJ.copydefault("ConvertImChatToVoUseCase", "toContentVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (C40001qFr) pairOLrzqt.component1();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40001qFr AEQbTJ(@NotNull java.util.List<qGF> list) {
        C40004qFu c40004qFu;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            SearchResultData searchResultDataAEQbTJ = ((qGF) it.next()).AEQbTJ();
            if (searchResultDataAEQbTJ instanceof SearchResultData.ChatAndContact) {
                SearchResultData.ChatAndContact chatAndContact = (SearchResultData.ChatAndContact) searchResultDataAEQbTJ;
                c40004qFu = new C40004qFu(C35339ntU.OLrzqt(chatAndContact), C35339ntU.EZpvd(chatAndContact), searchResultDataAEQbTJ);
            } else if (searchResultDataAEQbTJ instanceof SearchResultData.Message) {
                SearchResultData.Message message = (SearchResultData.Message) searchResultDataAEQbTJ;
                c40004qFu = new C40004qFu(C35339ntU.EZpvd(message), C35339ntU.copydefault(message), searchResultDataAEQbTJ);
            } else {
                c40004qFu = null;
            }
            if (c40004qFu != null) {
                arrayList.add(c40004qFu);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((qGF) it2.next()).AEQbTJ());
        }
        return new C40001qFr(arrayList2, arrayList);
    }
}
