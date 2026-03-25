package o;

import com.okinc.assets.backend.api.WithdrawEntryPoint;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC8224ayh;
import o.InterfaceC8231ayo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45332snm implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        android.app.Activity activityKWHzl;
        InterfaceC8231ayo taskDescription;
        C44760scx.log$default("CommonOpenWithdrawDetailHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if (obj instanceof C45299snF) {
            InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.OLrzqt(InterfaceC8224ayh.class);
            if (interfaceC8224ayh != null && (activityKWHzl = C45357soK.KWHzl.KWHzl(context)) != null) {
                C45299snF c45299snF = (C45299snF) obj;
                if (c45299snF.OLrzqt()) {
                    taskDescription = new InterfaceC8231ayo.ActionBar(c45299snF.EZpvd(), null);
                } else if (c45299snF.AEQbTJ() != null) {
                    taskDescription = new InterfaceC8231ayo.TaskDescription(c45299snF.EZpvd(), c45299snF.AEQbTJ().booleanValue());
                } else {
                    return Unit.INSTANCE;
                }
                InterfaceC8224ayh.TaskDescription.goToWithdraw$default(interfaceC8224ayh, activityKWHzl, new WithdrawEntryPoint.WithdrawalDetail(taskDescription), null, null, 12, null);
            }
            return Unit.INSTANCE;
        }
        C44760scx.log$default("CommonOpenWithdrawDetailHandler: invoke > data is not CurrencyModel", null, 2, null);
        return Unit.INSTANCE;
    }
}
