package o;

import com.okinc.okimcore.feature.conversation.listener.RefreshEvent;
import com.okinc.okimcore.feature.conversation.refresh.ConversationRefreshUseCaseImpl$handleRefreshWhenNewMsg$1;
import com.okinc.okimcore.feature.conversation.refresh.ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.sGH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sGP implements sGH {
    public final CoroutineDispatcher AEQbTJ;
    public final CoroutineScope EZpvd;
    public final sMN KWHzl;
    public final sFU copydefault;

    @yCM
    public sGP(@NotNull sFU sfu, @NotNull sMN smn, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(smn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.copydefault = sfu;
        this.KWHzl = smn;
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = coroutineScope;
    }

    @Override // o.sGH
    public void KWHzl(@NotNull RefreshEvent refreshEvent, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(refreshEvent, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        KWHzl();
    }

    @Override // o.sGH
    public void AEQbTJ(boolean z) {
        KWHzl();
    }

    @Override // o.sGH
    public void AEQbTJ(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        KWHzl();
    }

    public void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1(this, null), 3, null);
    }

    @Override // o.sGH
    public void AEQbTJ(@NotNull OKConversationType oKConversationType, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (this.copydefault.copydefault(str) == null && oKConversationType == OKConversationType.PRIVATE && str2 != null) {
            if (sDZ.AEQbTJ.valueOf().KWHzl(str2) == null) {
                BuildersKt__Builders_commonKt.launch$default(this.EZpvd, this.AEQbTJ, null, new ConversationRefreshUseCaseImpl$handleRefreshWhenNewMsg$1(str2, str3, this, null), 2, null);
                return;
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE).KWHzl(yBP.AEQbTJ());
            final Function1 function1 = new Function1() { // from class: o.sGL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return sGP.AEQbTJ(this.AEQbTJ, (Unit) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.sGM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return sGP.KWHzl(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.sGN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return sGP.KWHzl((java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXOLrzqt = abstractC58185ywXAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.sGO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return sGP.gEmmrt(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
            C33527myD.KWHzl(abstractC58185ywXOLrzqt).DbNXlk();
            return;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(Unit.INSTANCE).KWHzl(yBP.AEQbTJ());
        final Function1 function13 = new Function1() { // from class: o.sGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sGP.copydefault(this.KWHzl, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.sGU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return sGP.djBIcL(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.sGQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sGP.copydefault((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = abstractC58185ywXAEQbTJ2.OLrzqt(new InterfaceC58229yxO() { // from class: o.sGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return sGP.AhwBna(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt2, "");
        C33527myD.KWHzl(abstractC58185ywXOLrzqt2).DbNXlk();
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit AEQbTJ(sGP sgp, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        sGH.Application.refreshConversationList$default(sgp, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return AbstractC58185ywX.KWHzl();
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final Unit djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit copydefault(sGP sgp, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        sgp.AEQbTJ(true);
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return AbstractC58185ywX.KWHzl();
    }
}
