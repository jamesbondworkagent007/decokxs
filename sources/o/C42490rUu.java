package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C42490rUu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42490rUu extends C43265rly {
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(OKComplianceRestrictionService.class, C56392yDr.copydefault(new Function0() { // from class: o.rUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42490rUu.AYXKKw();
            }
        }));
    }

    public static final rUH AYXKKw() {
        return rUH.Companion.copydefault();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.rUw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42490rUu.copydefault();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.rUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42490rUu.djBIcL();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.rUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42490rUu.valueOf();
            }
        }));
    }

    public static final rUB copydefault() {
        return new rUB();
    }

    public static final C42494rUy djBIcL() {
        return new C42494rUy();
    }

    public static final rUA valueOf() {
        return new rUA();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        super.onCreate();
        pUU.KWHzl("FeatureRestrictionRepository", "application_oncreate");
        rUH.Companion.copydefault().RcXXUw();
        registerActivityLifecycleCallbacks(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.rUu$TaskDescription */
    public static final class TaskDescription extends C32981mno {
        public TaskDescription() {
        }

        @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            C42490rUu.this.unregisterActivityLifecycleCallbacks(this);
            final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).getFieldNames();
            pUU.KWHzl("FeatureRestrictionRepository", "frInitTime=" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("feature_restriction_init_time", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rUx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42490rUu.TaskDescription.AEQbTJ(jCurrentTimeMillis, (EventParamsList) obj);
                }
            });
            super.onActivityCreated(activity, bundle);
        }

        public static final Unit AEQbTJ(long j, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "frInitTime", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j), false, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
    }
}
