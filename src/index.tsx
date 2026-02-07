import AppLifecycleManager from './NativeAppLifecycleManager';

/**
 * Multiply two numbers using the native AppLifecycleManager module.
 *
 * @param a First number to multiply
 * @param b Second number to multiply
 * @returns The result of multiplying a and b
 */

export function multiply(a: number, b: number): number {
  return AppLifecycleManager.multiply(a, b);
}
