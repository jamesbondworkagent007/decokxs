package o;

import android.view.View;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C28000kLe extends C33542myS {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28000kLe(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28000kLe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        try {
            return super.onSaveInstanceState();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            final java.lang.String str = "exception:" + e.getMessage() + " \n traces:" + stackTraceString;
            C32866mlf.KWHzl("array_Bounds_Exception_Track", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.kLc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28000kLe.AEQbTJ(str, (EventParamsList) obj);
                }
            });
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "message", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "fragment", "BaseMarketTabFragment", false, 4, null);
        return Unit.INSTANCE;
    }
}
