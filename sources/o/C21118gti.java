package o;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21118gti extends ActivityResultContract<Application, java.lang.Integer> {

    /* JADX INFO: renamed from: o.gti$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = application.EZpvd;
            }
            if ((i & 4) != 0) {
                z2 = application.OLrzqt;
            }
            return application.OLrzqt(str, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.EZpvd == application.EZpvd && this.OLrzqt == application.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(walletId=" + this.AEQbTJ + ", pageFinishAnimationFromBottom=" + this.EZpvd + ", isFirstTimeUse=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.EZpvd = z;
            this.OLrzqt = z2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(application, "");
        return ActivityC21086gtC.Companion.copydefault(context, application.EZpvd(), application.AEQbTJ(), application.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer parseResult(int i, android.content.Intent intent) {
        return java.lang.Integer.valueOf(i);
    }
}
