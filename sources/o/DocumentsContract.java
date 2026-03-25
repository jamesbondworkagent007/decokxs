package o;

import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDatasetsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDocumentClassificationJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDocumentClassifierSummariesPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDocumentClassifiersPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDominantLanguageDetectionJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEndpointsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEntitiesDetectionJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEntityRecognizerSummariesPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEntityRecognizersPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEventsDetectionJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listFlywheelsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listKeyPhrasesDetectionJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listPiiEntitiesDetectionJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listSentimentDetectionJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listTargetedSentimentDetectionJobsPaginated$2;
import aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listTopicsDetectionJobsPaginated$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.HealthKeys;
import o.HealthStats;
import o.HealthStatsParceler;
import o.PidHealthStats;
import o.SystemClock;
import o.SystemVibrator;
import o.Temperature;
import o.TestLooperManager;
import o.TransactionTooLargeException;
import o.UEventObserver;
import o.UidHealthStats;
import o.UpdateLock;
import o.VibrationEffect;
import o.Vibrator;
import o.VintfObject;
import o.VintfRuntimeInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DocumentsContract {
    public static /* synthetic */ Flow listDatasetsPaginated$default(LocalSocket localSocket, SystemClock systemClock, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            systemClock = SystemClock.copydefault.copydefault(new Function1<SystemClock.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDatasetsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SystemClock.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SystemClock.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(localSocket, systemClock);
    }

    public static final Flow<SystemProperties> OLrzqt(@NotNull LocalSocket localSocket, @NotNull SystemClock systemClock) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(systemClock, "");
        return FlowKt.flow(new PaginatorsKt$listDatasetsPaginated$2(systemClock, localSocket, null));
    }

    public static /* synthetic */ Flow listDocumentClassificationJobsPaginated$default(LocalSocket localSocket, SystemVibrator systemVibrator, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            systemVibrator = SystemVibrator.copydefault.copydefault(new Function1<SystemVibrator.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDocumentClassificationJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SystemVibrator.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SystemVibrator.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return copydefault(localSocket, systemVibrator);
    }

    public static final Flow<SystemUpdateManager> copydefault(@NotNull LocalSocket localSocket, @NotNull SystemVibrator systemVibrator) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(systemVibrator, "");
        return FlowKt.flow(new PaginatorsKt$listDocumentClassificationJobsPaginated$2(systemVibrator, localSocket, null));
    }

    public static /* synthetic */ Flow listDocumentClassifiersPaginated$default(LocalSocket localSocket, Temperature temperature, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            temperature = Temperature.EZpvd.AEQbTJ(new Function1<Temperature.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDocumentClassifiersPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Temperature.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Temperature.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            });
        }
        return AEQbTJ(localSocket, temperature);
    }

    public static final Flow<TokenWatcher> AEQbTJ(@NotNull LocalSocket localSocket, @NotNull Temperature temperature) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(temperature, "");
        return FlowKt.flow(new PaginatorsKt$listDocumentClassifiersPaginated$2(temperature, localSocket, null));
    }

    public static /* synthetic */ Flow listDocumentClassifierSummariesPaginated$default(LocalSocket localSocket, TestLooperManager testLooperManager, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            testLooperManager = TestLooperManager.OLrzqt.OLrzqt(new Function1<TestLooperManager.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDocumentClassifierSummariesPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TestLooperManager.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TestLooperManager.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            });
        }
        return copydefault(localSocket, testLooperManager);
    }

    public static final Flow<Trace> copydefault(@NotNull LocalSocket localSocket, @NotNull TestLooperManager testLooperManager) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(testLooperManager, "");
        return FlowKt.flow(new PaginatorsKt$listDocumentClassifierSummariesPaginated$2(testLooperManager, localSocket, null));
    }

    public static /* synthetic */ Flow listDominantLanguageDetectionJobsPaginated$default(LocalSocket localSocket, TransactionTooLargeException transactionTooLargeException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transactionTooLargeException = TransactionTooLargeException.OLrzqt.KWHzl(new Function1<TransactionTooLargeException.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listDominantLanguageDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TransactionTooLargeException.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TransactionTooLargeException.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            });
        }
        return copydefault(localSocket, transactionTooLargeException);
    }

    public static final Flow<TransactionTracker> copydefault(@NotNull LocalSocket localSocket, @NotNull TransactionTooLargeException transactionTooLargeException) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(transactionTooLargeException, "");
        return FlowKt.flow(new PaginatorsKt$listDominantLanguageDetectionJobsPaginated$2(transactionTooLargeException, localSocket, null));
    }

    public static /* synthetic */ Flow listEndpointsPaginated$default(LocalSocket localSocket, UEventObserver uEventObserver, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uEventObserver = UEventObserver.copydefault.KWHzl(new Function1<UEventObserver.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEndpointsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UEventObserver.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UEventObserver.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(localSocket, uEventObserver);
    }

    public static final Flow<UpdateEngine> OLrzqt(@NotNull LocalSocket localSocket, @NotNull UEventObserver uEventObserver) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(uEventObserver, "");
        return FlowKt.flow(new PaginatorsKt$listEndpointsPaginated$2(uEventObserver, localSocket, null));
    }

    public static /* synthetic */ Flow listEntitiesDetectionJobsPaginated$default(LocalSocket localSocket, UpdateLock updateLock, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateLock = UpdateLock.EZpvd.EZpvd(new Function1<UpdateLock.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEntitiesDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UpdateLock.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UpdateLock.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(localSocket, updateLock);
    }

    public static final Flow<UpdateEngineCallback> OLrzqt(@NotNull LocalSocket localSocket, @NotNull UpdateLock updateLock) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(updateLock, "");
        return FlowKt.flow(new PaginatorsKt$listEntitiesDetectionJobsPaginated$2(updateLock, localSocket, null));
    }

    public static /* synthetic */ Flow listEntityRecognizersPaginated$default(LocalSocket localSocket, Vibrator vibrator, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vibrator = Vibrator.copydefault.EZpvd(new Function1<Vibrator.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEntityRecognizersPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Vibrator.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Vibrator.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return EZpvd(localSocket, vibrator);
    }

    public static final Flow<UserManagerInternal> EZpvd(@NotNull LocalSocket localSocket, @NotNull Vibrator vibrator) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(vibrator, "");
        return FlowKt.flow(new PaginatorsKt$listEntityRecognizersPaginated$2(vibrator, localSocket, null));
    }

    public static /* synthetic */ Flow listEntityRecognizerSummariesPaginated$default(LocalSocket localSocket, VibrationEffect vibrationEffect, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vibrationEffect = VibrationEffect.KWHzl.OLrzqt(new Function1<VibrationEffect.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEntityRecognizerSummariesPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VibrationEffect.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VibrationEffect.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(localSocket, vibrationEffect);
    }

    public static final Flow<UserManager> OLrzqt(@NotNull LocalSocket localSocket, @NotNull VibrationEffect vibrationEffect) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(vibrationEffect, "");
        return FlowKt.flow(new PaginatorsKt$listEntityRecognizerSummariesPaginated$2(vibrationEffect, localSocket, null));
    }

    public static /* synthetic */ Flow listEventsDetectionJobsPaginated$default(LocalSocket localSocket, VintfObject vintfObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vintfObject = VintfObject.KWHzl.KWHzl(new Function1<VintfObject.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listEventsDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VintfObject.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VintfObject.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            });
        }
        return KWHzl(localSocket, vintfObject);
    }

    public static final Flow<GpsBatteryStats> KWHzl(@NotNull LocalSocket localSocket, @NotNull VintfObject vintfObject) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(vintfObject, "");
        return FlowKt.flow(new PaginatorsKt$listEventsDetectionJobsPaginated$2(vintfObject, localSocket, null));
    }

    public static /* synthetic */ Flow listFlywheelsPaginated$default(LocalSocket localSocket, VintfRuntimeInfo vintfRuntimeInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vintfRuntimeInfo = VintfRuntimeInfo.OLrzqt.EZpvd(new Function1<VintfRuntimeInfo.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listFlywheelsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VintfRuntimeInfo.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VintfRuntimeInfo.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            });
        }
        return copydefault(localSocket, vintfRuntimeInfo);
    }

    public static final Flow<CellularBatteryStats> copydefault(@NotNull LocalSocket localSocket, @NotNull VintfRuntimeInfo vintfRuntimeInfo) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(vintfRuntimeInfo, "");
        return FlowKt.flow(new PaginatorsKt$listFlywheelsPaginated$2(vintfRuntimeInfo, localSocket, null));
    }

    public static /* synthetic */ Flow listKeyPhrasesDetectionJobsPaginated$default(LocalSocket localSocket, HealthKeys healthKeys, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            healthKeys = HealthKeys.AEQbTJ.copydefault(new Function1<HealthKeys.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listKeyPhrasesDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HealthKeys.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HealthKeys.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return KWHzl(localSocket, healthKeys);
    }

    public static final Flow<HealthStatsWriter> KWHzl(@NotNull LocalSocket localSocket, @NotNull HealthKeys healthKeys) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(healthKeys, "");
        return FlowKt.flow(new PaginatorsKt$listKeyPhrasesDetectionJobsPaginated$2(healthKeys, localSocket, null));
    }

    public static /* synthetic */ Flow listPiiEntitiesDetectionJobsPaginated$default(LocalSocket localSocket, HealthStatsParceler healthStatsParceler, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            healthStatsParceler = HealthStatsParceler.KWHzl.OLrzqt(new Function1<HealthStatsParceler.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listPiiEntitiesDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HealthStatsParceler.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HealthStatsParceler.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return copydefault(localSocket, healthStatsParceler);
    }

    public static final Flow<WifiBatteryStats> copydefault(@NotNull LocalSocket localSocket, @NotNull HealthStatsParceler healthStatsParceler) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(healthStatsParceler, "");
        return FlowKt.flow(new PaginatorsKt$listPiiEntitiesDetectionJobsPaginated$2(healthStatsParceler, localSocket, null));
    }

    public static /* synthetic */ Flow listSentimentDetectionJobsPaginated$default(LocalSocket localSocket, HealthStats healthStats, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            healthStats = HealthStats.EZpvd.KWHzl(new Function1<HealthStats.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listSentimentDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HealthStats.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HealthStats.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            });
        }
        return copydefault(localSocket, healthStats);
    }

    public static final Flow<ServiceHealthStats> copydefault(@NotNull LocalSocket localSocket, @NotNull HealthStats healthStats) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(healthStats, "");
        return FlowKt.flow(new PaginatorsKt$listSentimentDetectionJobsPaginated$2(healthStats, localSocket, null));
    }

    public static /* synthetic */ Flow listTargetedSentimentDetectionJobsPaginated$default(LocalSocket localSocket, PidHealthStats pidHealthStats, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pidHealthStats = PidHealthStats.copydefault.OLrzqt(new Function1<PidHealthStats.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listTargetedSentimentDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PidHealthStats.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PidHealthStats.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return copydefault(localSocket, pidHealthStats);
    }

    public static final Flow<ProcessHealthStats> copydefault(@NotNull LocalSocket localSocket, @NotNull PidHealthStats pidHealthStats) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(pidHealthStats, "");
        return FlowKt.flow(new PaginatorsKt$listTargetedSentimentDetectionJobsPaginated$2(pidHealthStats, localSocket, null));
    }

    public static /* synthetic */ Flow listTopicsDetectionJobsPaginated$default(LocalSocket localSocket, UidHealthStats uidHealthStats, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uidHealthStats = UidHealthStats.AEQbTJ.EZpvd(new Function1<UidHealthStats.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.paginators.PaginatorsKt$listTopicsDetectionJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UidHealthStats.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UidHealthStats.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            });
        }
        return KWHzl(localSocket, uidHealthStats);
    }

    public static final Flow<StorageEventListener> KWHzl(@NotNull LocalSocket localSocket, @NotNull UidHealthStats uidHealthStats) {
        Intrinsics.checkNotNullParameter(localSocket, "");
        Intrinsics.checkNotNullParameter(uidHealthStats, "");
        return FlowKt.flow(new PaginatorsKt$listTopicsDetectionJobsPaginated$2(uidHealthStats, localSocket, null));
    }
}
