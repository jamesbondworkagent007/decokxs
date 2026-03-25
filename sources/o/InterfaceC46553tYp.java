package o;

import com.okinc.preference.data.model.ValuationCurrencyBean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tYp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46553tYp extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.content.Context context, int i, boolean z);

    void AEQbTJ(@NotNull InterfaceC46547tYj interfaceC46547tYj);

    int OcIXYQ();

    int QKVWgx();

    java.util.ArrayList<ValuationCurrencyBean> QOLQEE();

    java.lang.String QUSxYX();

    java.lang.String QVAiDq();

    double QbewEr();

    int QfsBiF();

    java.lang.String RJOkX();

    void copydefault(@NotNull java.util.ArrayList<ValuationCurrencyBean> arrayList);

    void fJNWhG();

    ValuationCurrencyBean zLjUOn();

    /* JADX INFO: renamed from: o.tYp$Application */
    public static final class Application {
        public static /* synthetic */ void setValuationCurrencyId$default(InterfaceC46553tYp interfaceC46553tYp, android.content.Context context, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValuationCurrencyId");
            }
            if ((i2 & 4) != 0) {
                z = true;
            }
            interfaceC46553tYp.AEQbTJ(context, i, z);
        }
    }
}
