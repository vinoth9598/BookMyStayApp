# BookMyStayApp
BookMyStayApp is a full-stack hotel booking application that allows users to search, view, and book hotels online. The platform provides a seamless experience for customers to find accommodations and manage reservations while enabling administrators to manage hotels, rooms, and bookings efficiently.
# BookMyStayApp - Branch Wise Development

## Development Branch

### Branch: `dev`

**Description**
The main integration branch where all completed features are merged and tested before release.

**Responsibilities**

* Integrates all user stories.
* Runs complete application testing.
* Maintains stable codebase.
* Prepares release versions.

---

## User Case 1: Room Inventory Management

### Branch: `feature/uc1-room-inventory-management`

**Objective**
Manage hotel room inventory and room details.

**Features Implemented**

* Add new rooms.
* Update room details.
* Delete rooms.
* View available rooms.
* Manage room types (Single, Double, Suite).
* Store room capacity and pricing.

**Classes/Modules**

* Room
* RoomRepository
* RoomService

**Expected Outcome**
Hotel administrators can efficiently manage room inventory.

---

## User Case 2: Room Search & Availability Check

### Branch: `feature/uc2-room-search-availability-check`

**Objective**
Allow users to search rooms and check availability.

**Features Implemented**

* Search rooms by type.
* Search rooms by date range.
* Check room availability.
* Display available room details.

**Classes/Modules**

* SearchService
* AvailabilityChecker
* RoomFilter

**Expected Outcome**
Users can quickly find available rooms matching their requirements.

---

## User Case 3: Booking Request (First Come First Served)

### Branch: `feature/UC3-booking-request-first-come-first-served`

**Objective**
Handle room booking requests using First-Come-First-Served allocation.

**Features Implemented**

* Create booking request.
* Validate room availability.
* Allocate room based on request order.
* Prevent double booking.

**Classes/Modules**

* Booking
* BookingService
* BookingValidator

**Business Rules**

* Earliest booking request gets priority.
* Once booked, room becomes unavailable for overlapping dates.

**Expected Outcome**
Fair room allocation process without conflicts.

---

## User Case 4: Reservation Confirmation & Room Allocation

### Branch: `feature/UC4-reservation-confirmation-room-allocation`

**Objective**
Confirm reservations and assign rooms.

**Features Implemented**

* Reservation confirmation.
* Room allocation.
* Generate booking reference.
* Reservation status tracking.

**Reservation Status**

* Pending
* Confirmed
* Cancelled

**Classes/Modules**

* Reservation
* ReservationService
* RoomAllocator

**Expected Outcome**
Customers receive confirmed room reservations with assigned rooms.

---

## User Case 5: Add-On Service Selection

### Branch: `feature/UC5-add-on-service-selection`

**Objective**
Allow customers to select additional services during booking.

**Features Implemented**

* Breakfast selection.
* Airport pickup service.
* Extra bed option.
* Laundry service.
* Service cost calculation.

**Classes/Modules**

* AddOnService
* ServiceCalculator
* BookingEnhancer

**Expected Outcome**
Customers can customize bookings with optional services.

---

## User Case 6: Booking History & Reporting

### Branch: `feature/UC6-booking-history-reporting`

**Objective**
Track bookings and generate reports.

**Features Implemented**

* View booking history.
* Customer booking reports.
* Room utilization reports.
* Revenue reports.
* Reservation summaries.

**Classes/Modules**

* BookingReport
* ReportGenerator
* HistoryService

**Expected Outcome**
Administrators can analyze booking trends and generate reports.

---

## Project Workflow

```bash
git checkout dev

git checkout -b feature/uc1-room-inventory-management

git checkout -b feature/uc2-room-search-availability-check

git checkout -b feature/UC3-booking-request-first-come-first-served

git checkout -b feature/UC4-reservation-confirmation-room-allocation

git checkout -b feature/UC5-add-on-service-selection

git checkout -b feature/UC6-booking-history-reporting
```

## Branch Merge Flow

```text
feature/uc1-room-inventory-management
                ↓
feature/uc2-room-search-availability-check
                ↓
feature/UC3-booking-request-first-come-first-served
                ↓
feature/UC4-reservation-confirmation-room-allocation
                ↓
feature/UC5-add-on-service-selection
                ↓
feature/UC6-booking-history-reporting
                ↓
               dev
```

