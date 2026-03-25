package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import o.AbstractC5549Vz;
import o.WJ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AccessorNamingStrategy {

    public static class Base extends AccessorNamingStrategy implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public String findNameForIsGetter(AnnotatedMethod annotatedMethod, String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public String findNameForMutator(AnnotatedMethod annotatedMethod, String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public String modifyFieldName(AnnotatedField annotatedField, String str) {
            return str;
        }
    }

    public static abstract class Provider implements Serializable {
        private static final long serialVersionUID = 1;

        public abstract AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, WJ wj, AbstractC5549Vz abstractC5549Vz);

        public abstract AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, WJ wj);

        public abstract AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, WJ wj);
    }

    public abstract String findNameForIsGetter(AnnotatedMethod annotatedMethod, String str);

    public abstract String findNameForMutator(AnnotatedMethod annotatedMethod, String str);

    public abstract String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str);

    public abstract String modifyFieldName(AnnotatedField annotatedField, String str);
}
