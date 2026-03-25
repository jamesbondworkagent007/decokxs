package o;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* JADX INFO: renamed from: o.Wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5562Wm {

    /* JADX INFO: renamed from: o.Wm$StateListAnimator */
    public static class StateListAnimator implements InterfaceC5562Wm {
        @Override // o.InterfaceC5562Wm
        public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, ValueInstantiator valueInstantiator) {
            return valueInstantiator;
        }
    }

    ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, ValueInstantiator valueInstantiator);
}
