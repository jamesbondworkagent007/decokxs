package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSetter {
    String AEQbTJ() default "";

    Nulls EZpvd() default Nulls.DEFAULT;

    Nulls OLrzqt() default Nulls.DEFAULT;

    /* JADX INFO: loaded from: classes21.dex */
    public static class Value implements Serializable {
        protected static final Value EMPTY;
        private static final long serialVersionUID = 1;
        private final Nulls _contentNulls;
        private final Nulls _nulls;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Value empty() {
            return EMPTY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Nulls getContentNulls() {
            return this._contentNulls;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Nulls getValueNulls() {
            return this._nulls;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Class<JsonSetter> valueFor() {
            return JsonSetter.class;
        }

        static {
            Nulls nulls = Nulls.DEFAULT;
            EMPTY = new Value(nulls, nulls);
        }

        public Value(Nulls nulls, Nulls nulls2) {
            this._nulls = nulls;
            this._contentNulls = nulls2;
        }

        public Object readResolve() {
            return _empty(this._nulls, this._contentNulls) ? EMPTY : this;
        }

        public static Value from(JsonSetter jsonSetter) {
            return jsonSetter == null ? EMPTY : construct(jsonSetter.EZpvd(), jsonSetter.OLrzqt());
        }

        public static Value construct(Nulls nulls, Nulls nulls2) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls2 == null) {
                nulls2 = Nulls.DEFAULT;
            }
            return _empty(nulls, nulls2) ? EMPTY : new Value(nulls, nulls2);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value forValueNulls(Nulls nulls) {
            return construct(nulls, Nulls.DEFAULT);
        }

        public static Value forValueNulls(Nulls nulls, Nulls nulls2) {
            return construct(nulls, nulls2);
        }

        public static Value forContentNulls(Nulls nulls) {
            return construct(Nulls.DEFAULT, nulls);
        }

        public Value withOverrides(Value value) {
            if (value == null || value == EMPTY) {
                return this;
            }
            Nulls nulls = value._nulls;
            Nulls nulls2 = value._contentNulls;
            Nulls nulls3 = Nulls.DEFAULT;
            if (nulls == nulls3) {
                nulls = this._nulls;
            }
            if (nulls2 == nulls3) {
                nulls2 = this._contentNulls;
            }
            return (nulls == this._nulls && nulls2 == this._contentNulls) ? this : construct(nulls, nulls2);
        }

        public Value withValueNulls(Nulls nulls) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            return nulls == this._nulls ? this : construct(nulls, this._contentNulls);
        }

        public Value withValueNulls(Nulls nulls, Nulls nulls2) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls2 == null) {
                nulls2 = Nulls.DEFAULT;
            }
            return (nulls == this._nulls && nulls2 == this._contentNulls) ? this : construct(nulls, nulls2);
        }

        public Value withContentNulls(Nulls nulls) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            return nulls == this._contentNulls ? this : construct(this._nulls, nulls);
        }

        public Nulls nonDefaultValueNulls() {
            Nulls nulls = this._nulls;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        public Nulls nonDefaultContentNulls() {
            Nulls nulls = this._contentNulls;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this._nulls, this._contentNulls);
        }

        public int hashCode() {
            return this._nulls.ordinal() + (this._contentNulls.ordinal() << 2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return value._nulls == this._nulls && value._contentNulls == this._contentNulls;
        }

        private static boolean _empty(Nulls nulls, Nulls nulls2) {
            Nulls nulls3 = Nulls.DEFAULT;
            return nulls == nulls3 && nulls2 == nulls3;
        }
    }
}
