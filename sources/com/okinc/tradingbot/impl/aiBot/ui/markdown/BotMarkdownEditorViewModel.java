package com.okinc.tradingbot.impl.aiBot.ui.markdown;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.uCO;
import o.uLN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotMarkdownEditorViewModel extends uLN<Activity> {
    public final uCO OLrzqt;

    @yCM
    public BotMarkdownEditorViewModel(@NotNull uCO uco) {
        Intrinsics.checkNotNullParameter(uco, "");
        this.OLrzqt = uco;
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotMarkdownEditorViewModel$fetchDefaultTemplate$1(this, null), 3, null);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class C0634Activity implements Activity {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0634Activity copy$default(C0634Activity c0634Activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0634Activity.AEQbTJ;
                }
                return c0634Activity.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0634Activity OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0634Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0634Activity) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((C0634Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TemplateLoaded(template=" + this.AEQbTJ + ")";
            }

            public C0634Activity(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }
}
