package com.okinc.tradingbot.impl.aiBot.ui.preview;

import androidx.lifecycle.ViewModelKt;
import com.immomo.mls.fun.lt.SILoading;
import com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto;
import com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.uCS;
import o.uLN;
import o.wUL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PreviewAiStrategyViewModel extends uLN<StateListAnimator> {
    public final CoroutineDispatcher EZpvd;
    public final uCS OLrzqt;

    @yCM
    public PreviewAiStrategyViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uCS ucs) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ucs, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = ucs;
    }

    public final void OLrzqt(@NotNull AiOrderReq aiOrderReq) {
        Intrinsics.checkNotNullParameter(aiOrderReq, "");
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.EZpvd.plus(wUL.OLrzqt(new Function1() { // from class: o.uGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PreviewAiStrategyViewModel.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        })), null, new PreviewAiStrategyViewModel$previewStrategy$2(this, aiOrderReq, null), 2, null);
    }

    public static final Unit copydefault(PreviewAiStrategyViewModel previewAiStrategyViewModel, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        previewAiStrategyViewModel.EZpvd(new StateListAnimator.ActionBar(th));
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {

        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription implements StateListAnimator {
            public static final TaskDescription OLrzqt = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1233308173;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return SILoading.LUA_CLASS_NAME;
            }

            private TaskDescription() {
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Application implements StateListAnimator {
            public final PreviewAiStrategyResponseDto EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, PreviewAiStrategyResponseDto previewAiStrategyResponseDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    previewAiStrategyResponseDto = application.EZpvd;
                }
                return application.EZpvd(previewAiStrategyResponseDto);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PreviewAiStrategyResponseDto EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull PreviewAiStrategyResponseDto previewAiStrategyResponseDto) {
                Intrinsics.checkNotNullParameter(previewAiStrategyResponseDto, "");
                return new Application(previewAiStrategyResponseDto);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(response=" + this.EZpvd + ")";
            }

            public Application(@NotNull PreviewAiStrategyResponseDto previewAiStrategyResponseDto) {
                Intrinsics.checkNotNullParameter(previewAiStrategyResponseDto, "");
                this.EZpvd = previewAiStrategyResponseDto;
            }
        }

        public static final class ActionBar implements StateListAnimator {
            public final Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = actionBar.AEQbTJ;
                }
                return actionBar.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new ActionBar(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(throwable=" + this.AEQbTJ + ")";
            }

            public ActionBar(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }
    }
}
