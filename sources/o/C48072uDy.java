package o;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48072uDy extends ActivityResultContract<C48069uDv, Indicator> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull C48069uDv c48069uDv) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c48069uDv, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC48051uDd.class);
        intent.putExtra("extra_indicator", c48069uDv.EZpvd());
        intent.putExtra("extra_remaining_slots", c48069uDv.OLrzqt());
        intent.putExtra("extra_max_indicators", c48069uDv.copydefault());
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Indicator parseResult(int i, android.content.Intent intent) {
        android.os.Bundle extras;
        if (i != -1 || intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (Indicator) BundleCompat.getParcelable(extras, "extra_indicator", Indicator.class);
    }

    /* JADX INFO: renamed from: o.uDy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uDy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
