package com.okinc.components.track.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class EventParamsList extends ArrayList<EventParam> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final /* synthetic */ void write$Self$OKAnalytics_track(EventParamsList eventParamsList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.bean.EventParamsList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EventParamsList> serializer() {
            return EventParamsList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EventParamsList(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public /* bridge */ boolean contains(EventParam eventParam) {
        return super.contains((Object) eventParam);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof EventParam) {
            return contains((EventParam) obj);
        }
        return false;
    }

    public int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(EventParam eventParam) {
        return super.indexOf((Object) eventParam);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof EventParam) {
            return indexOf((EventParam) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(EventParam eventParam) {
        return super.lastIndexOf((Object) eventParam);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof EventParam) {
            return lastIndexOf((EventParam) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final EventParam remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(EventParam eventParam) {
        return super.remove((Object) eventParam);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof EventParam) {
            return remove((EventParam) obj);
        }
        return false;
    }

    public EventParam removeAt(int i) {
        return (EventParam) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }

    public EventParamsList() {
    }

    public EventParamsList(int i) {
        super(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventParamsList(@NotNull Collection<EventParam> collection) {
        super(collection);
        Intrinsics.checkNotNullParameter(collection, "");
    }

    public static /* synthetic */ void put$default(EventParamsList eventParamsList, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        eventParamsList.put(str, str2, z);
    }

    public final void put(@NotNull String str, @NotNull String str2, boolean z) {
        EventParam next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Iterator<EventParam> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.copydefault(), (Object) str)) {
                    break;
                }
            }
        }
        EventParam eventParam = next;
        if (eventParam != null) {
            eventParam.OLrzqt(str2);
        } else {
            add(new EventParam(str, str2, z));
        }
    }

    public final void set(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        put$default(this, str, str2, false, 4, null);
    }
}
