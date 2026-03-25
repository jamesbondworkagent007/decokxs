package aws.sdk.kotlin.services.rekognition.waiters;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import o.C5082Ea;
import o.C5085Ed;
import o.C59462zhW;
import o.C59519zia;
import o.DY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WaitersKt$waitUntilProjectVersionRunning$strategy$1 extends Lambda implements Function1<DY.TaskDescription.ActionBar, Unit> {
    public static final WaitersKt$waitUntilProjectVersionRunning$strategy$1 INSTANCE = new WaitersKt$waitUntilProjectVersionRunning$strategy$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WaitersKt$waitUntilProjectVersionRunning$strategy$1() {
        super(1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DY.TaskDescription.ActionBar actionBar) {
        invoke2(actionBar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DY.TaskDescription.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd(20);
        actionBar.AEQbTJ(C5082Ea.copydefault);
        actionBar.AEQbTJ(new Function1<C5085Ed.TaskDescription.Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.waiters.WaitersKt$waitUntilProjectVersionRunning$strategy$1.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5085Ed.TaskDescription.Activity activity) {
                invoke2(activity);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C5085Ed.TaskDescription.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
                DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                activity.AEQbTJ(C59519zia.EZpvd(30000, durationUnit));
                activity.KWHzl(1.5d);
                activity.EZpvd(1.0d);
                activity.copydefault(C59519zia.EZpvd(120000, durationUnit));
            }
        });
    }
}
