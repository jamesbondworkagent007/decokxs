package o;

import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface ComponentCallbacks2 extends DialogInterface {

    public static abstract class Application {
        public boolean AhwBna;
        public DialogInterface gEmmrt;
        public final long AEQbTJ = SQLiteDatabase.copydefault();
        public final java.util.List<Function0<Unit>> copydefault = new java.util.ArrayList();
        public final java.util.List<Function0<Unit>> KWHzl = new java.util.ArrayList();
        public final java.util.Set<java.lang.Integer> AYXKKw = new LinkedHashSet();
        public final java.util.Set<java.lang.String> OLrzqt = new LinkedHashSet();
        public boolean EZpvd = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DialogInterface dialogInterface) {
            this.gEmmrt = dialogInterface;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Set<java.lang.Integer> AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.AhwBna;
        }

        public abstract Application EZpvd();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.AhwBna = z;
        }

        public abstract IntentSender<Unit> OLrzqt(boolean z);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Function0<Unit>> djBIcL() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Set<java.lang.String> gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Function0<Unit>> valueOf() {
            return this.copydefault;
        }

        public final Application AEQbTJ() {
            return EZpvd();
        }

        public final IntentSender<Unit> OLrzqt() {
            KWHzl();
            return OLrzqt(this.AhwBna && this.EZpvd);
        }

        public void KWHzl(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            KWHzl();
            this.copydefault.add(function0);
        }

        public void EZpvd(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            KWHzl();
            this.KWHzl.add(function0);
        }

        public final void KWHzl() {
            if (this.AEQbTJ != SQLiteDatabase.copydefault()) {
                throw new java.lang.IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.".toString());
            }
        }
    }
}
