package com.reown.android.sdk.storage.data.dao;

import com.reown.android.sdk.storage.data.dao.EventDao;
import com.reown.android.sdk.storage.data.dao.EventQueries;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.C59442zhC;
import o.Configuration;
import o.ContentResolver;
import o.IntentSender;
import o.PackageManager;
import o.yDY;
import o.yHA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EventQueries extends ContentResolver {
    public final EventDao.Adapter EventDaoAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventQueries(@NotNull PackageManager packageManager, @NotNull EventDao.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.EventDaoAdapter = adapter;
    }

    public final <T> AssistContent<T> getAllEventsWithLimitAndOffset(long j, long j2, @NotNull final yHA<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super List<String>, ? super Long, ? super String, ? super String, ? super String, ? extends T> yha) {
        Intrinsics.checkNotNullParameter(yha, "");
        return new GetAllEventsWithLimitAndOffsetQuery(this, j, j2, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.EventQueries.getAllEventsWithLimitAndOffset.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHA<? super java.lang.Long, ? super java.lang.String, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHA<Long, String, Long, String, String, String, List<String>, Long, String, String, String, T> yha2 = yha;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                Long lEZpvd2 = assetManager.EZpvd(2);
                Intrinsics.copydefault(lEZpvd2);
                String strKWHzl2 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl3);
                String strKWHzl4 = assetManager.KWHzl(5);
                String strKWHzl5 = assetManager.KWHzl(6);
                return yha2.invoke(lEZpvd, strKWHzl, lEZpvd2, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5 != null ? this.EventDaoAdapter.getTraceAdapter().decode(strKWHzl5) : null, assetManager.EZpvd(7), assetManager.KWHzl(8), assetManager.KWHzl(9), assetManager.KWHzl(10));
            }
        });
    }

    public final AssistContent<EventDao> getAllEventsWithLimitAndOffset(long j, long j2) {
        return getAllEventsWithLimitAndOffset(j, j2, new yHA<Long, String, Long, String, String, String, List<? extends String>, Long, String, String, String, EventDao>() { // from class: com.reown.android.sdk.storage.data.dao.EventQueries.getAllEventsWithLimitAndOffset.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHA
            public /* synthetic */ EventDao invoke(Long l, String str, Long l2, String str2, String str3, String str4, List<? extends String> list, Long l3, String str5, String str6, String str7) {
                return invoke(l.longValue(), str, l2.longValue(), str2, str3, str4, (List<String>) list, l3, str5, str6, str7);
            }

            public final EventDao invoke(long j3, @NotNull String str, long j4, @NotNull String str2, @NotNull String str3, String str4, List<String> list, Long l, String str5, String str6, String str7) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                return new EventDao(j3, str, j4, str2, str3, str4, list, l, str5, str6, str7);
            }
        });
    }

    public final void insertOrAbort(final Long l, @NotNull final String str, final long j, @NotNull final String str2, @NotNull final String str3, final String str4, final List<String> list, final Long l2, final String str5, final String str6, final String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        getDriver().AEQbTJ(679696970, "INSERT OR ABORT INTO EventDao(event_id, bundle_id, timestamp,  event_name, type, topic, trace, correlation_id, client_id, direction, user_agent)\nVALUES (?,?,?,?,?,?, ?, ?, ?, ?, ?)", 11, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.EventQueries.insertOrAbort.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.OLrzqt(0, l);
                configuration.copydefault(1, str);
                configuration.OLrzqt(2, Long.valueOf(j));
                configuration.copydefault(3, str2);
                configuration.copydefault(4, str3);
                configuration.copydefault(5, str4);
                List<String> list2 = list;
                configuration.copydefault(6, list2 != null ? this.EventDaoAdapter.getTraceAdapter().encode(list2) : null);
                configuration.OLrzqt(7, l2);
                configuration.copydefault(8, str5);
                configuration.copydefault(9, str6);
                configuration.copydefault(10, str7);
            }
        });
        notifyQueries(679696970, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.EventQueries.insertOrAbort.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("EventDao");
            }
        });
    }

    public final void deleteByIds(@NotNull final Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        String strCreateArguments = createArguments(collection.size());
        getDriver().AEQbTJ(null, C59442zhC.trimMargin$default("\n        |DELETE FROM EventDao\n        |WHERE event_id IN " + strCreateArguments + "\n        ", null, 1, null), collection.size(), new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.EventQueries.deleteByIds.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                int i = 0;
                for (Object obj : collection) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    configuration.OLrzqt(i, Long.valueOf(((Number) obj).longValue()));
                    i++;
                }
            }
        });
        notifyQueries(-301265492, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.EventQueries.deleteByIds.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("EventDao");
            }
        });
    }

    public final void deleteAllTelemetry() {
        PackageManager.StateListAnimator.execute$default(getDriver(), 1509225965, "DELETE FROM EventDao\nWHERE correlation_id IS NULL", 0, null, 8, null);
        notifyQueries(1509225965, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.EventQueries.deleteAllTelemetry.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("EventDao");
            }
        });
    }

    public final class GetAllEventsWithLimitAndOffsetQuery<T> extends AssistContent<T> {
        public final /* synthetic */ EventQueries this$0;
        public final long value;
        public final long value_;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getValue_() {
            return this.value_;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Event.sq:getAllEventsWithLimitAndOffset";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllEventsWithLimitAndOffsetQuery(EventQueries eventQueries, long j, @NotNull long j2, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = eventQueries;
            this.value = j;
            this.value_ = j2;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"EventDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"EventDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(34532163, "SELECT event_id, bundle_id, timestamp, event_name, type, topic, trace, correlation_id, client_id, direction, user_agent\nFROM EventDao ed\nLIMIT ? OFFSET ?", function1, 2, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.EventQueries$GetAllEventsWithLimitAndOffsetQuery$execute$1
                public final /* synthetic */ EventQueries.GetAllEventsWithLimitAndOffsetQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.EventQueries$GetAllEventsWithLimitAndOffsetQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.OLrzqt(0, Long.valueOf(this.this$0.getValue()));
                    configuration.OLrzqt(1, Long.valueOf(this.this$0.getValue_()));
                }
            });
        }
    }
}
